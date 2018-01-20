import scala.collection.mutable.ArrayBuffer

object adventOfCodeDay2 extends App {

  override def main(args: Array[String]): Unit = {
    val s1 = "5 1 9 5\n7 5 3\n2 4 6 8"
    val s2 = "179\t2358\t5197\t867\t163\t4418\t3135\t5049\t187\t166\t4682\t5080\t5541\t172\t4294\t1397\n2637\t136\t3222\t591\t2593\t1982\t4506\t195\t4396\t3741\t2373\t157\t4533\t3864\t4159\t142\n1049\t1163\t1128\t193\t1008\t142\t169\t168\t165\t310\t1054\t104\t1100\t761\t406\t173\n200\t53\t222\t227\t218\t51\t188\t45\t98\t194\t189\t42\t50\t105\t46\t176\n299\t2521\t216\t2080\t2068\t2681\t2376\t220\t1339\t244\t605\t1598\t2161\t822\t387\t268\n1043\t1409\t637\t1560\t970\t69\t832\t87\t78\t1391\t1558\t75\t1643\t655\t1398\t1193\n90\t649\t858\t2496\t1555\t2618\t2302\t119\t2675\t131\t1816\t2356\t2480\t603\t65\t128\n2461\t5099\t168\t4468\t5371\t2076\t223\t1178\t194\t5639\t890\t5575\t1258\t5591\t6125\t226\n204\t205\t2797\t2452\t2568\t2777\t1542\t1586\t241\t836\t3202\t2495\t197\t2960\t240\t2880\n560\t96\t336\t627\t546\t241\t191\t94\t368\t528\t298\t78\t76\t123\t240\t563\n818\t973\t1422\t244\t1263\t200\t1220\t208\t1143\t627\t609\t274\t130\t961\t685\t1318\n1680\t1174\t1803\t169\t450\t134\t3799\t161\t2101\t3675\t133\t4117\t3574\t4328\t3630\t4186\n1870\t3494\t837\t115\t1864\t3626\t24\t116\t2548\t1225\t3545\t676\t128\t1869\t3161\t109\n890\t53\t778\t68\t65\t784\t261\t682\t563\t781\t360\t382\t790\t313\t785\t71\n125\t454\t110\t103\t615\t141\t562\t199\t340\t80\t500\t473\t221\t573\t108\t536\n1311\t64\t77\t1328\t1344\t1248\t1522\t51\t978\t1535\t1142\t390\t81\t409\t68\t352"
    val data = prepareData(s2)
    part1(data)
  }

  def prepareData(input: String): Array[Array[String]] = {
    val splitted = input.split("\n")
    val t = splitted.map(x => x.split("\t"))
    t
  }

  def part1(cap: Array[Array[String]]): Unit = {
    val diffs = new ArrayBuffer[Int]
    for (i <- cap) {
      val ints = i.map(x => x.toInt)
      val sorted = ints.sorted
      val min = sorted.head
      val max = sorted.last
      //    println("min: " + min)
      //    println("max: " + max)
      val diff = max - min
      diffs += diff
    }
    //  diffs.foreach(x => println("diff: " + x))
    println("sum: " + diffs.foldLeft(0)((a, b) => a + b))
  }
}


