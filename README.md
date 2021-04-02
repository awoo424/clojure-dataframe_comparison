# Clojure libraries for data science
A comparison of different libraries for dataframe manipulation and big data analytics in Clojure

## List of libraries

| Library | Description |
| ------- | ----------- |
| [tech.ml.dataset](https://github.com/techascent/tech.ml.dataset) | For data processing and machine learning |
| [Geni](https://github.com/zero-one-group/geni) | Dataframe library that runs on Apache Spark |
|[Onyx](http://www.onyxplatform.org/)| High performance distributed computation system |


## Tutorials for each library

### tech.ml.dataset
- [Code walkthrough](https://techascent.github.io/tech.ml.dataset/walkthrough.html)
- [Simple examples](https://techascent.github.io/tech.ml.dataset/walkthrough.html) (data export to/from SQL)

### Geni
- [Geni Cookbook](https://github.com/zero-one-group/geni/tree/develop/docs/cookbook)

### Onyx
- [Onyx cheatsheet](http://www.onyxplatform.org/docs/cheat-sheet/latest/)


## Performance benchmarks

- [Rankings](https://github.com/zero-one-group/geni-performance-benchmark/) for each library in Python / Julia / Clojure

## Useful tech stack

Data format framework
- [Apache Arrow](https://arrow.apache.org/) (for in-memory columnar)
- [Apache Parquet](https://parquet.apache.org/) (for on-disk storage columnar)
- [Apache Arrow vs Apache Parquet](https://www.youtube.com/watch?v=dPb2ZXnt2_U&ab_channel=DataWorksSummit)

Streaming framework
- [Apache Storm](https://storm.apache.org/)
