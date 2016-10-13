(ns helloworld.core)

(defn say-hello []
  #?(:clj (println "Hello from Clojure")
      :cljs (js/console.log "Hello from ClojureScript")))

(say-hello)
