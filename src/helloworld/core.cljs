(ns helloworld.core
  (:require [reagent.core :as reagent]))

(defn say-hello []
  (js/console.log "Hello from ClojureScript"))

(defonce app-state
  (reagent/atom {:message "Hello from app state"
                 :items [{:display "Karius"}
                          {:display "Lovren"}
                          {:display "Henderson"}
                          {:display "Coutinho"}
                          {:display "Sturridge"}]}))

(defn items-list [items]
  [:div {:class "items-list"}
   (for [item items]
     [:div {:class "item" :key (:display item)}
      [:p (:display item)]])])

(defn app []
  [:div
    [:h1 (:message @app-state)]
    [items-list (:items @app-state)]])

(reagent/render [app] (js/document.getElementById "cljs-target"))
