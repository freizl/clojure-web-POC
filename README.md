# hello-clj-web

A Clojure library designed to ... well, that part is up to you.

## Deploy to SinaApp
  1. `lein deps`
  2. `lein ring uberwar`
  3. rename the generated war file under target folder agaist your SAE app name then upload.  
     E.g. my app url is <http://clojure0701.sinaapp.com/>, the war name shall be `clojure0701.war`

## Usage
  - [ubuntu postgresql](https://help.ubuntu.com/community/PostgreSQL)
  - start postgres repl: `sudo -u postgres psql postgres`

## TODO
  1. [ ] route has query param
  2. [X] RESTful route
  3. [ ] login module
  4. [ ] security module
  5. [ ] DB module
  6. [ ] test cases

## Question

  - diff between `use` and `require`
  - dynamic reloading when `lein run`

## License

Copyright © 2013 FIXME

Distributed under the Eclipse Public License, the same as Clojure.
