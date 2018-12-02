package two.solutions

import two.{Box, Rules}
import util.ResourceExt.ResourceLines

object PartOne {

  val input = "day-two-input.txt"

  def main(args: Array[String]): Unit = {
    val lines = input.processLines(line => line)
    println(Box.findIt(lines))
  }

}
