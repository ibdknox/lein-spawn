(ns leiningen.spawn
  (use [leiningen.core :only [read-project]])
  (:require [spawn.core :as spawn-core]))

(defn spawn-project [genome project args]
  (println "Generating a project from the" genome "genome.")
  (spawn-core/spawn genome :project project :args args))
 
(defn spawn 
  "Create and manage noir projects."
  {:help-arglists '([genome])}
  ([]
     (println "Usage: lein spawn genome project-name"))
  ([genome & args] 
   (let [proj (read-project)]
     (spawn-project genome proj args)))) 
