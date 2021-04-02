(ns clojure-dataframe.geni
    (:require [zero-one.geni.core :as g])
    (:gen-class))
  
  ; example data
  (def dataframe (g/read-parquet! "/resources/housing.csv"))

  ; get number of rows
  (println (g/count dataframe))
  
  ; =========================== Testing with APIs =========================== ;
  