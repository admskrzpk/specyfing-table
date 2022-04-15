
object SpecifyingTable extends App {

  import org.apache.spark.sql.SparkSession

  val spark = SparkSession
    .builder()
    .master("local[*]")
    .getOrCreate()

  val path = "C:\\spark\\specyfing-table\\files"
  val tableName = args(0)
  val query = args.tail.mkString(" ")

  val sample100: Unit = spark
    .read
    .option("header", value = true)
    .option("inferSchema", value = true)
    .csv(path)
    .createOrReplaceTempView(tableName)

  val results = spark.sql(query).show()
}

