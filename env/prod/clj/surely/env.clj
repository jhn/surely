(ns surely.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[surely started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[surely has shut down successfully]=-"))
   :middleware identity})
