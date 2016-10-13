(ns helloworld.core
  (:require [reagent.core :as reagent]))

(defn say-hello []
  (js/console.log "Hello from ClojureScript"))

(defn app []
  [:div
   (for [i (range 5)]
     [:h1 {:key i} (str i " " "Hello from Reagent!!!")])])

(reagent/render [app] (js/document.getElementById "cljs-target"))
