object Main extends App {

  val string="abbccdcdcdabaaab"

  val regex="^(ab|bc|cd)+$".r

  regex.findFirstIn(string) match {
    case Some(_) => println("yes")
    case _ => println("no")
  }
}
