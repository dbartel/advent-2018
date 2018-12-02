package two.solutions

import two.Box
import util.ResourceExt.ResourceLines

object PartTwo {
  val input = "day-two-input.txt"

  def main(args: Array[String]): Unit = {

    val solution = input.reduceLines(Box.findCommon)

    println(s"Solution: $solution")
  }
}
