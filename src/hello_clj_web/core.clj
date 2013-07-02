(ns hello-clj-web.core
  (:use [ring.adapter.jetty :as ring]
        [compojure.core :only (defroutes GET)]
        [compojure.handler :as handler]
        [compojure.route :as route]
        [hiccup.page :only (html5)]
        )
  (:require [hello-clj-web.controller.core :as controller])
)

;(defn handler [req]
;  {:status 200
;   :headers {"Content-Type" "text/html"}
;   :body "Hello Clojure Web - brought to you by... Ring! and dynamic change" })

(defroutes main-routes
  (GET "/" [] (controller/index))
  (GET "/user/:name" [name] (controller/user name))
  (GET "/users" [] (controller/users))
  (GET "/q" {params :params} (controller/query params))
  (route/files "/")
  (route/not-found "Page not found")
)

;;; FIXME: error if user this
(defn app [] (handler/site main-routes))

(defn -main []
  (run-jetty (app) {:port 8888 :join? false}))
