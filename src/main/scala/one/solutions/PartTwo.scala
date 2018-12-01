package one.solutions

import one.{Frequency, ParseInput}

object PartTwo {
  val input = "day-one-input.txt"

  def main(args: Array[String]): Unit = {
    val output = Frequency.findFirstRepeated(
      ParseInput.toInput(input)
    )

    println(s"Output: $output")
  }

}
