import scala.collection.mutable.ListBuffer

object adventOfCodeDay6 extends App {

  override def main(args: Array[String]): Unit = {
    val s1 = "0\t2\t7\t0"
    val s2 = "11\t11\t13\t7\t0\t15\t5\t5\t4\t4\t1\t1\t7\t1\t15\t11"

//    val res = part1(s2)
//    println(res)
    val res2 = part2(s2)
    println(res2)
  }

  def part1(input: String): Int = {
    val arr = input.split("\t").map(x => x.toInt)
    val tracking = new ListBuffer[String]
    tracking += arr.mkString("")
    val accum = 0
    val max = arr.foldLeft(0)((a, b) => a.max(b))
    val firstIndex = arr.indexOf(max)
    arr(firstIndex) = 0
    val nextIndex = firstIndex + 1

    def recurse(array: Array[Int], trackingArray: ListBuffer[String], indexer: Int, maxInt: Int, accumulator: Int):  Int = {
      if (maxInt == 0) {
//        println("array: " + array.mkString("\t"))
//        println("indexer: " + indexer)
//        println("maxInt: " + maxInt)
        if (trackingArray.contains(array.mkString(""))) {
          return accumulator + 1
        }
        val newMax = array.foldLeft(0)((a, b) => a.max(b))
//        println("newMax: " + newMax)
        val firstIndex = array.indexOf(newMax)
//        println("firstIndex: " + firstIndex)
        trackingArray += array.mkString("")
//        trackingArray.foreach(x => println("trackingArray: " + x.mkString("\t")))
        array(firstIndex) = 0
//        println("array: " + array.mkString("\t"))
        val nextIndex = if (array.length - 1 == firstIndex) 0 else firstIndex + 1
//        println("nextIndex: " + nextIndex)
        recurse(array, trackingArray, nextIndex, newMax, accumulator + 1)
      } else {
        val nextIndex = if (array.length - 1 == indexer) 0 else indexer + 1
        array(indexer) = array(indexer) + 1
        recurse(array, trackingArray, nextIndex, maxInt - 1, accumulator)
      }
    }
    recurse(arr, tracking, nextIndex, max, accum)

  }

  def part2(input: String): Int = {
    val arr = input.split("\t").map(x => x.toInt)
    val accum = 0
    val tracking = new ListBuffer[(Int, String)]
    val tup = (accum, arr.mkString(""))
    tracking += tup
    val max = arr.foldLeft(0)((a, b) => a.max(b))
    val firstIndex = arr.indexOf(max)
    arr(firstIndex) = 0
    val nextIndex = firstIndex + 1

    def recurse(array: Array[Int], trackingArray: ListBuffer[(Int, String)], indexer: Int, maxInt: Int, accumulator: Int):  Int = {
      if (maxInt == 0) {
        //        println("array: " + array.mkString("\t"))
        //        println("indexer: " + indexer)
        //        println("maxInt: " + maxInt)
        val mat = trackingArray.filter(x => x._2.contains(array.mkString("")))
        if (mat.nonEmpty) {
          return accumulator - mat.head._1
        }
        val newMax = array.foldLeft(0)((a, b) => a.max(b))
        //        println("newMax: " + newMax)
        val firstIndex = array.indexOf(newMax)
        //        println("firstIndex: " + firstIndex)
        val tup = (accumulator, arr.mkString(""))
        trackingArray += tup
        //        trackingArray.foreach(x => println("trackingArray: " + x.mkString("\t")))
        array(firstIndex) = 0
        //        println("array: " + array.mkString("\t"))
        val nextIndex = if (array.length - 1 == firstIndex) 0 else firstIndex + 1
        //        println("nextIndex: " + nextIndex)
        recurse(array, trackingArray, nextIndex, newMax, accumulator + 1)
      } else {
        val nextIndex = if (array.length - 1 == indexer) 0 else indexer + 1
        array(indexer) = array(indexer) + 1
        recurse(array, trackingArray, nextIndex, maxInt - 1, accumulator)
      }
    }
    recurse(arr, tracking, nextIndex, max, accum)

  }

}
