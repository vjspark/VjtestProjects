import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.SQLContext

/**
  * Created by edureka on 1/21/17.
  */
object SampleApp {

  def main(args: Array[String]): Unit = {


    val conf = new SparkConf().setMaster("local[*]").setAppName("SampleApp")
    val sc = new SparkContext(conf)
    val sqlContext = new SQLContext(sc)

    val newDf = sqlContext.read.format("parquet")
      .load("/usr/local/spark-2.0.0/examples/src/main/resources/users.parquet")

    newDf.show(10,truncate = false)

  }

}
