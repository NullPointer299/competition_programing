package AtCoder.ABC049

import scala.io.StdIn.readLine

object ABC0049C_Hakuchumu extends App {

  val S = readLine()
  val regex = "^(dream|dreamer|erase|eraser)+$".r

  regex.findFirstIn(S) match {
    case Some(_) => println("YES")
    case _ => println("NO")
  }
}
