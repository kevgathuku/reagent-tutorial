(defproject helloworld "0.1.0-SNAPSHOT"
            :description "FIXME: write description"
            :url "http://example.com/FIXME"
            :license {:name "Eclipse Public License"
                      :url "http://www.eclipse.org/legal/epl-v10.html"}
            :main helloworld.core
            :dependencies [[org.clojure/clojure "1.8.0"]
                           [org.clojure/clojurescript "1.9.229"]
                           [reagent "0.6.0"]
                           [lein-cljsbuild "1.1.4"]]
            :cljsbuild {:builds [{:id "dev"
                                  :source-paths ["src"]
                                  ; :figwheel true
                                  :compiler
                                  {:optimizations :none
                                   :output-to "resources/public/javascripts/dev.js"
                                   :output-dir "resources/public/javascripts/cljs-dev"
                                   :pretty-print true
                                   :source-map true}}]}
            :plugins [[lein-cljsbuild "1.1.4"]])
