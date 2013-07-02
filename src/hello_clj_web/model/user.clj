(ns hello-clj-web.model.user)

(use 'korma.core
     'korma.db)
(require '[clojure.string :as str])

(declare users)

(defdb prod (postgres {:db "hello"
                       :user "postgres"
                       :password "postgres"
                       }))

(defentity users
  (entity-fields :first :last :email)
  (table :Users))
