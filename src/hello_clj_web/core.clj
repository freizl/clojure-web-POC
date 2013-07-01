(ns hello-clj-web.core
  (:use [ring.adapter.jetty :as ring]
        [compojure.core :only (defroutes GET)]
        [hiccup.page :only (html5)]
        ))

(defn handler [req]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello Clojure Web - brought to you by... Ring! and dynamic change" })

(defn index []
  (html5
   [:head
    [:title "Hello Hiccup"]]
   [:body
    [:p {:id "content" :class "content"} "Hello Hiccup"]
    [:a {:href "/hello"} "Hello"]]
   ))

(defroutes routes
  (GET "/" [] (index))
  (GET "/hello" [] "<h2>Hello Compojure</h2>")
)

(defn -main []
  (run-jetty routes {:port 8888 :join? false}))
