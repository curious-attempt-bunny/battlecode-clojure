(ns clojurebot.robotplayer
    (:gen-class
        :name clojurebot.RobotPlayer
        :main false
        :methods [^{:static true} [run [battlecode.common.RobotController] void]]))
 
(defn run [rc] (.yield rc))