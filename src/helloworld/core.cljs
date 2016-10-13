(ns helloworld.core
  (:require [reagent.core :as reagent]))

(defn say-hello []
  (js/console.log "Hello from ClojureScript"))

(def app-state
  (reagent/atom {:message "Hello from app state" :count 3}))

(defn app []
  [:div
    (if (> (:count @app-state) 1)
      [:h1 (:message @app-state)]
      [:h1 "Hello from the component"])])

(reagent/render [app] (js/document.getElementById "cljs-target"))
