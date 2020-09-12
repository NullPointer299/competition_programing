package AtCoder.ABC081

import scala.io.StdIn.readLine

object ABC081A_PlacingMarbles extends App {

  val in = readLine().toCharArray.map(_.toString.toInt)
  println(in.count(_ == 1))
}
