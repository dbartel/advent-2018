package one

import scala.io.Source

object ParseInput {

  def toInput(filename: String): List[Frequency.Value] = Source.fromResource(filename)
    .getLines()
    .map(_.toInt)
    .toList

}
