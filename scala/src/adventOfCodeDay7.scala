import scala.collection.mutable
import scala.util.{Failure, Success, Try}

object adventOfCodeDay7 extends App {

  override def main(args: Array[String]): Unit = {
    val test = "pbga (66)\nxhth (57)\nebii (61)\nhavc (66)\nktlj (57)\nfwft (72) -> ktlj, cntj, xhth\nqoyq (66)\npadx (45) -> pbga, havc, qoyq\ntknk (41) -> ugml, padx, fwft\njptl (61)\nugml (68) -> gyxo, ebii, jptl\ngyxo (61)\ncntj (57)"
    val finalMap = new mutable.LinkedHashMap[Array[String], String]()
    val testSplit = test.split("\n").map(x => x.split("->"))

    testSplit.map(x => {
      println("x: " + x.mkString("\t"))
      Try(finalMap(x)) match {
        case Success(mapped) => {
          println("mapped: " + mapped)
          mapped match {
            case s: String => finalMap += x -> mapped
            case _ => finalMap += x -> ""
          }
        }
        case Failure(mapped) =>
          finalMap += x -> ""
      }
    })

//    testSplit.foreach(x => println(x.mkString("\t")))
    finalMap.foreach(x => println(x._1.mkString("\t") + ":" + x._2))
  }

}
