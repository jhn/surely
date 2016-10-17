(ns surely.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [surely.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[surely started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[surely has shut down successfully]=-"))
   :middleware wrap-dev})
