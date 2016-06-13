(ns deadbeef-user.core
  (:require [deadbeef.core :as deadbeef]
            [other.deadbeef :as other]))

(defn -main
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!")
  (deadbeef/foo x)
  (other/foo x))
