(ns user
  (:require [mount.core :as mount]
            surely.core))

(defn start []
  (mount/start-without #'surely.core/repl-server))

(defn stop []
  (mount/stop-except #'surely.core/repl-server))

(defn restart []
  (stop)
  (start))


