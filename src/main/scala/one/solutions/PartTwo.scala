package one.solutions

import one.Frequency
import util.ResourceExt.ResourceLines

object PartTwo {
  val input = "day-one-input.txt"

  def main(args: Array[String]): Unit = {
    val output = Frequency.findFirstRepeated(input.processLines(_.toInt))
    println(s"Output: $output")
  }

}
