(ns lein-sass.core-test
  (:require
    [clojure.java.io :as io]
    [clojure.test :refer :all]
    [leiningen.sass :refer :all])
  (:import
    (java.io File)))

(def target-css-file (io/file "target/test.css"))
(def target-css-map-file (io/file "target/test.css.map"))

; FIXME: Calling `(sass ...)` will only work the first time it is called.
;        Afterwards it will do nothing and return `nil`.
(deftest test-compiler
  (testing "Basics"
    (.delete target-css-file)
    (.delete target-css-map-file)
    (is (true? (sass {:sass {:source "test/test.scss"
                             :target "target/"}}))
        "does not crash")
    (is (.exists target-css-file)
        "creates a CSS file")
    (is (.exists target-css-map-file)
        "creates a CSS Source Map file"))
  (testing "Content"
    (is (= ".selector {\n  margin: 10px; }\n  .selector .nested {\n    margin: 5px; }\n\n/*# sourceMappingURL=test.css.map */\n"
           (slurp target-css-file))
        "outputs CSS")
    (is (= "{\n  \"version\": 3,\n  \"file\": \"test.css\",\n  \"sources\": [\n    \"../test/test.scss\"\n  ],\n  \"mappings\": \"AAEA,AAAA,SAAS,CAAC;EACR,MAAM,EAHF,IAAI,GAOT;EALD,AAEE,SAFO,CAEP,OAAO,CAAC;IACN,MAAM,EAAE,GAAI,GACb\",\n  \"names\": []\n}"
           (slurp target-css-map-file))
        "outputs CSS Source Map")))
