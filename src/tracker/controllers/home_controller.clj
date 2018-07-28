(ns tracker.controllers.home-controller
  (:require [tracker.views.home :as views.home]))

(defn index [request]
  (views.home/index))
