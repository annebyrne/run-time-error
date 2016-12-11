object Anne {
  val truth: String = "assertion"
  val anne = new GirlDeveloper(6)

  def acceptedWisdom(author: GirlDeveloper, test: String) =
    if (author.goodEnough) {println("Hello world! " * 1000000)}
    else {
      author.internalised(test) match {
        case Some("confidence") => println("Hello world! " * 1000000)
        case Some("valid") => println("Hello world! " * 1000000)
        case Some("trusted") => println("Hello world! " * 1000000)
        case Some("potential") => println("Hello world! " * 1000000)
        case _ => println("Girls can't code. " * 1000000)
      }
    }

    def main(args: Array[String]) = acceptedWisdom(anne, truth)
}
