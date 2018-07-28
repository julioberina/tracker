(ns tracker.controllers.errors-controller
  (:require [tracker.views.errors :as views.errors]))

(defn not-found [request]
  (views.errors/not-found))
