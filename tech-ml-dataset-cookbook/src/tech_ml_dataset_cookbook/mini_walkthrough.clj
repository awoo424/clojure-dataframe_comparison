(ns tech-ml-dataset-cookbook.mini-walkthrough
    (:require [tech.v3.dataset :as ds]
              [tech.v3.libs.poi :refer :all])
    (:gen-class))
  
  ; example csv data
  (def csv-data (ds/->dataset "https://github.com/techascent/tech.ml.dataset/raw/master/test/data/stocks.csv"))
  
  ; example xsl data
  (def xls-data (ds/->dataset "https://github.com/techascent/tech.ml.dataset/raw/master/test/data/file_example_XLS_1000.xls"))
  (def person-data (ds/->dataset "https://github.com/techascent/tech.ml.dataset/raw/master/test/data/file_example_XLS_1000.xls"
    {:parser-fn {"Date" [:local-date "dd/MM/yyyy"]}}))
  
  ; =========================== Testing with APIs =========================== ;
  
  ; get first 5 rows
  (println (ds/head xls-data))
  (println (ds/head person-data))
  
  ; df -> map
  (println (take 2 (ds/mapseq-reader csv-data)))
  
  ; get columns
  (println (take 5 (xls-data "Gender")))
  
  ; get meta data about columns
  (println
    (->> csv-data
      vals  ;synonymous with ds/columns
      (map (fn [column]
            (meta column)))))
  
  ; get brief description of dataframe (takes some time to run)
  (println (ds/brief csv-data))  
    
  ; similar to describe()
  (println (ds/descriptive-stats csv-data))
  
  ; add or columns with `assoc` and `dissoc`
  (-> csv-data
    (assoc "always-ten" 10) ;scalar values are expanded as needed
    (assoc "random"   (repeatedly (ds/row-count csv-data) #(rand-int 100)))
    ds/head)
  
  (-> csv-data
    (dissoc "price")
    ds/head)
  