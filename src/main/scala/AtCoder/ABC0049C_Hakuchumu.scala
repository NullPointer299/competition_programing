package AtCoder

import scala.annotation.tailrec
import scala.io.StdIn.readLine

object ABC0049C_Hakuchumu extends App {

  val S = readLine()
  val regex = "^0+".r

  replacePattern(S, Seq("eraser", "erase", "dreamer", "dream")) match {
    case regex() => println("YES")
    case _ => println("NO")
  }

  @tailrec
  def replacePattern(string: String, pattern: Seq[String]): String = {
    if (pattern.isEmpty) string
    else replacePattern(string.replace(pattern.head, "0"), pattern.filterNot(_ == pattern.head))
  }
}
