(ns hello-clj-web.core
  (:use [ring.adapter.jetty :as ring]
        [compojure.core :only (defroutes GET)]
        [compojure.handler :as handler]
        [compojure.route :as route]
        [hiccup.page :only (html5)]
        )
  (:require [hello-clj-web.view.layout :as layout])
)

(defn handler [req]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello Clojure Web - brought to you by... Ring! and dynamic change" })

(defn index2 []
  (html5
   [:head
    [:title "Hello Hiccup"]]
   [:body
    [:p {:id "content" :class "content"} "Hello Hiccup"]
    [:a {:href "/hello"} "Hello"]]
   ))

(defroutes main-routes
  (GET "/" [] (layout/index))
  (GET "/user/:name" [name] (layout/user name))
  (GET "/q" {params :params} (layout/query params))
  (route/files "/")
  (route/not-found "Page not found")
)

(defn app [] (handler/site main-routes))

(defn -main []
  (run-jetty (app) {:port 8888 :join? false}))
