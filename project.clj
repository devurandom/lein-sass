(defproject yogthos/lein-sass "0.1.7"
  :description "SASS asset compiler using Sass.js and Nashorn"
  :url "https://github.com/yogthos/lein-sass"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :profiles {:kaocha {:dependencies [[lambdaisland/kaocha "0.0-319"]
                                     [lambdaisland/kaocha-cloverage "0.0-22"]
                                     [lambdaisland/kaocha-junit-xml "0.0-47"]]}}
  :aliases {"kaocha" ["with-profile" "+kaocha" "run" "-m" "kaocha.runner"]}
  :test-paths ["test/unit" "test/integration"])
