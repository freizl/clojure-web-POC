(ns hello-clj-web.controller.core
  (:use [hiccup.page :only (html5)]
        [korma.core :as db])
  (:require [hello-clj-web.view.layout :as layout]
            [hello-clj-web.model.user :as model])
)

(defn users []
  (println "FIXME: ")
  (println (-> (db/select model/users)))
  (layout/users))

(defn user [name]
  (layout/user name))

(defn index []
  (layout/index))

(defn query [params]
  (layout/query params))
