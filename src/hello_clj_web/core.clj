(ns hello-clj-web.core
  (:use [ring.adapter.jetty :as ring]
        [compojure.core :only (defroutes GET)]))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn handler [req]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello Clojure Web - brought to you by... Ring! and dynamic change" })

(defroutes routes
  (GET "/" [] "<h2>Hello Clojure</h2><a href='/hello'>Hello</a>")
  (GET "/hello" [] "<h2>Hello Compojure</h2>")
)

(defn -main []
  (run-jetty routes {:port 8888 :join? false}))
