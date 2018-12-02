package two

import org.scalatest.FlatSpec

class PartTwoTests extends FlatSpec {

  "input one" should "be fgij" in {
    val input = List("abcde",
      "fghij",
      "klmno",
      "pqrst",
      "fguij",
      "axcye",
      "wvxyz")

    assert(Box.findCommon(input) == "fgij")
  }

}
