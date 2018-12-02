package two

object Rules {
  type Rule = String => Boolean

  def nRepeating(n: Int)(str: String): Boolean = {
    str.map(c => {
      str.count(_ == c) == n
    }).exists(p => p)
  }

  val repeatTwo: Rule = nRepeating(2)

  val repeatThree: Rule = nRepeating(3)

}
