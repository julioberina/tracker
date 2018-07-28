(ns tracker.components
  (:require [coast.core :as coast]))

(defn layout [request body]
  (coast/html5
    [:head
     [:meta {:name "viewport" :content "width=device-width, initial-scale=1"}]
     (coast/include-css "/css/app.css")]
    [:body
     body
     (coast/include-js "/js/app.js")]))

(defn form [attrs & content]
  [:form attrs
   (coast/csrf)
   content])

(defn error-page []
  (coast/html5
    [:head
     [:meta {:name "viewport" :content "width=device-width, initial-scale=1"}]
     (coast/include-css "/css/app.css")]
    [:body
     "Something went wrong!"
     (coast/include-js "/js/app.js")]))
