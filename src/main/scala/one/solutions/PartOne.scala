package one.solutions

import one.Frequency
import util.ResourceExt.ResourceLines

object PartOne {
  val input = "day-one-input.txt"

  def main(args: Array[String]): Unit= {

    val output = Frequency.calculateChange(input.processLines(_.toInt))
    println(s"Output: $output")
  }
}
