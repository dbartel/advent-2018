package two

import org.scalatest.FlatSpec

class PartOneTests extends FlatSpec {
  "input one" should "be 12" in {
    val input = List(
      "abcdef",
      "bababc",
      "abbcde",
      "abcccd",
      "aabcdd",
      "abcdee",
      "ababab")

    assert(Box.findIt(input) == 12)
  }
}
