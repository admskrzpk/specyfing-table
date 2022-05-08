# Exercise: Specifying Table and SQL Query on Command Line
## Develop a standalone Spark SQL application that registers a temporary view and uses command-line arguments for the table name and the SQL query.
https://jaceklaskowski.github.io/spark-workshop/exercises/spark-sql-exercise-Specifying-Table-and-SQL-Query-on-Command-Line.html
Module: Spark SQL

Duration: 30 mins

Steps
1. Use args for the table name and the SQL query
1. args(0) is the table name
1. args(1) is the query to be executed
1. Register the dataset as a temporary view
1. Use createOrReplaceTempView
1. Execute the SQL query using spark.sql
