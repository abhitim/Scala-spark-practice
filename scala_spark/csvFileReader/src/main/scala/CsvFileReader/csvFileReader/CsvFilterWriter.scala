package CsvFileReader.csvFileReader
import org.apache.spark.sql.{DataFrame, SparkSession}

object CsvFilterWriter {
  def main(args: Array[String]): Unit = {
   
    val spark = SparkSession.builder()
      .appName("CsvFilterWriter")
      .master("local[*]")
      .getOrCreate()



   
    val filePath = "demo_csv.csv"
    val df = spark.read
      .format("csv")
      .option("header", "true") 
      .load(filePath)


    val filteredDF = df.filter(df("companyName") === "Google")


    filteredDF.write
      .format("csv")
      .option("header", "true")
      .mode("overwrite")  
      .save("filtered_csv.csv")

   
    spark.stop()
  }
}
