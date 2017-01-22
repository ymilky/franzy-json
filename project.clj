(defproject ymilky/franzy-json "0.0.1"
            :description "A Kafka Serializer/Deserializer supporting JSON, and an add-on for Franzy, a Clojure Kafka client."
            :url "https://github.com/ymilky/franzy-json"
            :author "ymilky"
            :license {:name "Eclipse Public License"
                      :url  "http://www.eclipse.org/legal/epl-v10.html"}
            :repositories {"snapshots" {:url           "https://clojars.org/repo"
                                        :username      :env
                                        :password      :env
                                        :sign-releases false}
                           "releases"  {:url           "https://clojars.org/repo"
                                        :username      :env
                                        :password      :env
                                        :sign-releases false}}
            :aot :all
            :dependencies [[org.clojure/clojure "1.8.0"]
                           [org.apache.kafka/kafka-clients "0.9.0.1"]
                           [cheshire "5.5.0"]]
            :plugins [[lein-codox "0.9.4"]]
            :codox {:metadata    {:doc/format :markdown}
                    :doc-paths   ["README.md"]
                    :output-path "doc/api"}
            :profiles {:dev              {:dependencies [[midje "1.7.0"]]
                                          :plugins      [[lein-midje "3.2"]
                                                         [lein-set-version "0.4.1"]
                                                         [lein-update-dependency "0.1.2"]
                                                         [lein-pprint "1.1.1"]]}
                       :reflection-check {:global-vars
                                          {*warn-on-reflection* true
                                           *assert*             false
                                           *unchecked-math*     :warn-on-boxed}}})
