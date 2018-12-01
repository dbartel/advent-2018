package one.solutions

import one.{Frequency, ParseInput}

object PartOne {
  val input = "day-one-input.txt"

  def main(args: Array[String]): Unit= {
    val output = Frequency.calculateChange(
      ParseInput.toInput(input)
    )

    println(s"Output: $output")
  }
}
