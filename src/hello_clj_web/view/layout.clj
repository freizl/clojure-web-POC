(ns hello-clj-web.view.layout
  (:use [hiccup.core :only (html)]
        [hiccup.page :only (html5 include-css)]))

(defn common [title & body]
  (html5
   [:head
    [:meta {:charset "utf-8"}]
    [:title title]
    (include-css "/css/main.css")]
   [:body
    [:div {:id "header"}
     [:ul
      [:li
       [:a {:href "/"} "Home"]]
      [:li
       [:a {:href "/user/simon"} "User"]]
      [:li
       [:a {:href "/q?a=1&b=2"} "Query"]]]]
    [:div {:id "container"} body]]
   ))


(defn index []
  (common
   "Hello Clojure Web"
   [:p "Hello Hiccup Index"]
   ))

(defn user [name]
  (common
   "Hello User"
   [:p (str "Hello User: " name)]
   ))

(defn query [params]
  (common
   "Hello query"
   [:p (str "Hello query" (pr-str params))]
   ))
