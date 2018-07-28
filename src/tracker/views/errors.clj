(ns tracker.views.errors
  (:require [tracker.components :as c]
            [coast.core :as coast]))

(defn not-found []
  (coast/not-found "Not found"))
