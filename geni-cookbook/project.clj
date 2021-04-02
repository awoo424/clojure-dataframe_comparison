(defproject geni-cookbook "0.0.1-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.2"]
                 [zero.one/geni "0.0.38"]
                 [metosin/jsonista "0.3.1"
                  :exclusions [com.fasterxml.jackson.core/jackson-databind]]
                 [expound "0.8.7"]
                 ;; Spark
                 [org.apache.spark/spark-core_2.12 "3.1.0"]
                 [org.apache.spark/spark-hive_2.12 "3.1.0"]
                 [org.apache.spark/spark-mllib_2.12 "3.1.0"]
                 [org.apache.spark/spark-sql_2.12 "3.1.0"]
                 [org.apache.spark/spark-streaming_2.12 "3.1.0"]
                 [org.apache.spark/spark-yarn_2.12 "3.1.0"]
                 [com.github.fommil.netlib/all "1.1.2" :extension "pom"]
                 ; Arrow
                 [org.apache.arrow/arrow-memory-netty "3.0.0"]
                 [org.apache.arrow/arrow-memory-core "3.0.0"]
                 [org.apache.arrow/arrow-vector "3.0.0"
                  :exclusions [commons-codec com.fasterxml.jackson.core/jackson-databind]]
                 ;; Databases
                 [mysql/mysql-connector-java "8.0.23"]
                 [org.postgresql/postgresql "42.2.18"]
                 [org.xerial/sqlite-jdbc "3.34.0"]]
  :profiles {:uberjar {:aot :all}
             :dev {:plugins [[lein-ancient "0.6.15"]]}}
  :main ^:skip-aot geni-cookbook.core
  :target-path "target/%s")
