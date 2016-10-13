(ns helloworld.core
  (:require [reagent.core :as reagent]))

(defn say-hello []
  (js/console.log "Hello from ClojureScript"))

(defn app []
  [:div
   [:p "Hello from Reagent!!!"]])

(reagent/render [app] (js/document.getElementById "cljs-target"))
