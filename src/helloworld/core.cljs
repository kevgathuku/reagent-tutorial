(ns helloworld.core
  (:require [reagent.core :as reagent]))

(defn say-hello []
  (js/console.log "Hello from ClojureScript"))

;; This function is called immediately the browser loads
(say-hello)
