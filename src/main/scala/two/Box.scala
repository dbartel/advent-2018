package two


object Box {

  def findIt(lines: List[String]): Int = {

    val toValue = (b: Boolean) => if (b) 1 else 0
    val rules = lines.map(line => (toValue(Rules.repeatTwo(line)), toValue(Rules.repeatThree(line))))

    val result = rules.fold((0,0))( (a,b) => {
      (a._1 + b._1, a._2 + b._2)
    })

    result._1 * result._2
  }


  def findCommon(lines: List[String]): String = {

    val results = lines.map(line => {
      lines.find(p => (line diff p).length == 1)
        .map(p => line intersect p)
    }).filter(_.isDefined)
      .map(_.get)


      results.filter(s => results.count(p => p == s) == 2).head
  }

}
