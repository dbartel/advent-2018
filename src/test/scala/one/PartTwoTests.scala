package one

import org.scalatest.FlatSpec

class PartTwoTests extends FlatSpec {
  "input one" should "be 0" in {
    assert(Frequency.findFirstRepeated(
      List(1,-1)
    ) == 0)
  }

  "input two" should "be 10" in {
    assert(Frequency.findFirstRepeated(
      List(3,3,4,-2,-4)
    ) == 10)
  }

  "input three" should "be 5" in {
    assert(Frequency.findFirstRepeated(
      List(-6,3,8,5,-6)
    ) == 5)
  }

  "input 4" should "be 14" in {
    assert(Frequency.findFirstRepeated(
      List(7,7,-2,-7,-4)
    ) == 14)
  }
}
