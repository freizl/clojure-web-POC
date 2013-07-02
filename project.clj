(defproject hello-clj-web "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [ [org.clojure/clojure "1.2.1"],
                  ;[org.clojure/java.jdbc "0.2.3"],
                  ;[postgresql "9.1-901.jdbc4"],
                  [ring/ring-core "1.1.6"],
                  [ring/ring-jetty-adapter "1.1.6"],
                  [ring/ring-json "0.2.0"],
                  [compojure "1.1.5"],
                  [hiccup "1.0.2"]
                  ]
  :plugins [[lein-ring "0.8.5"],
            [ring/ring-devel "1.1.6"]]
  ;:dev-dependencies []
  :ring {:handler hello-clj-web.core/main-routes}
)
