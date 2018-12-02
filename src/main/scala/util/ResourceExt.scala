package util

import scala.io.Source

object ResourceExt {
  implicit class ResourceLines(file: String) {
    def processLines[T](fn: String => T): List[T] = Source.fromResource(file)
      .getLines()
      .map(fn)
      .toList

    def reduceLines[T](fn: List[String] => T): T = fn(Source.fromResource(file)
      .getLines()
      .toList)
  }
}
