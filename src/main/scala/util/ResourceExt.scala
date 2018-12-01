package util

import scala.io.Source

object ResourceExt {
  implicit class ResourceLines(file: String) {
    def processLines[T](fn: String => T): List[T] = Source.fromResource(file)
      .getLines()
      .map(fn)
      .toList
  }
}
