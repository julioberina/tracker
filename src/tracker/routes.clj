(ns tracker.routes
  (:require [coast.core :as coast]
            [tracker.controllers.home-controller :as home]
            [tracker.controllers.errors-controller :as errors]))

(def routes
  (-> (coast/get "/" home/index)
      (coast/route-not-found errors/not-found)))
