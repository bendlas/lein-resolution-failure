(defproject deadbeef-user "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :main ^:skip-aot deadbeef-user.core
  ;; :eval-in :leiningen
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [other/deadbeef "0.1.0-SNAPSHOT"]
                 [webnf/enlive "0.2.0-SNAPSHOT"]
                 [enlive "1.1.6"]])
