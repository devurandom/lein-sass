# lein-sass

[![Clojars Project](https://img.shields.io/clojars/v/yogthos/lein-sass.svg)](https://clojars.org/yogthos/lein-sass)
[![CircleCI](https://circleci.com/gh/devurandom/lein-sass.svg?style=svg)](https://circleci.com/gh/devurandom/lein-sass)
[![codecov](https://codecov.io/gh/devurandom/lein-sass/branch/master/graph/badge.svg)](https://codecov.io/gh/devurandom/lein-sass)

A minimum dependency Clojure library designed to compile SASS and SCSS files using [Sass.js](https://github.com/medialize/sass.js), running on Nashorn.


## Usage

1. add the following to your `project.clj`
    ```clojure
    :plugins [[yogthos/lein-sass "VERSION"]]
    :sass {:source "my/sass/dir" :target "my/output/dir"}
    ```

2. start coding!
    * run `lein sass` to compile the assets
    * run `lein sass watch` to watch for changes and recompile files as necessary 


## License

Copyright © 2015-2018 [lein-sass authors](AUTHORS.md)

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.

