(defproject com.ninjakoala/ttlr "1.0.1"
  :description "TTLR - TTL cache with refresh"
  :url "https://github.com/ninjakoala/ttlr"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/tools.logging "0.3.1"]
                 [overtone/at-at "1.2.0"]]
  :profiles {:dev {:dependencies [[midje "1.6.3"]]
                   :plugins [[lein-midje "3.1.3"]]}}
  :plugins [[lein-release "1.0.5"]]
  :lein-release {:deploy-via :clojars})
