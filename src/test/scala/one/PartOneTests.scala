package one

import org.scalatest.FlatSpec

class PartOneTests extends FlatSpec {

  "input one" should "result in 3" in {
    assert(Frequency.calculateChange(List(1,1,1)) == 3)
  }

  "input two" should "result in 0" in {
    assert(Frequency.calculateChange(List(1,1,-2)) == 0)
  }

  "input three" should "result in -6" in {
    assert(Frequency.calculateChange(List(-1,-2,-3)) == -6)
  }

}
