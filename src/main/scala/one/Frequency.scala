package one

import scala.annotation.tailrec


object Frequency {
  type Value = Int

  def calculateChange(values: List[Value]): Value = values.sum

  @tailrec
  def findFirstRepeated(values: List[Value],
                cycleList: List[Value] = List(),
                current: Value = 0,
                previouslyCalculated: List[Value] = List(0)): Value = {

    val stack = cycleList match {
      case List() => values
      case _ => cycleList
    }

    val next = current + stack.head

    if (previouslyCalculated.contains(next)) next
    else findFirstRepeated(values, stack.tail, next, next :: previouslyCalculated)

  }

}
