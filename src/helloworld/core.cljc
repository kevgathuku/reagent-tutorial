(ns helloworld.core
  (:require [reagent.core :as reagent]))

;; js/.. Refers to the global object in JS i.e. window
;; .cljs files don't require the #?() syntax
(defn say-hello []
  #?(:cljs (js/console.log "Hello from ClojureScript")))

;; This function is called immediately the browser loads
(say-hello)
