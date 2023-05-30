package org.scala.learning

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext





object Demo {
  def main(args:Array[String]){

    val conf= new SparkConf();
    conf.setAppName("firstApplication");
    conf.setMaster("local");
    val sc= new SparkContext(conf);
    
    val arr=Array(1,2,3,4,5,6,7,8,9);
    
    val arrRdd=sc.parallelize(arr, 2);
    
    println("No of elements in Rdd->",arrRdd.count());
    
    arrRdd.foreach(println);
  }
}