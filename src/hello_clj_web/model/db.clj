(use 'korma.db)
(require '[clojure.string :as str])

(defdb prod (postgres {:db "shouter"
                       :user "postgres"
                       :password "postgres"
                       }))
