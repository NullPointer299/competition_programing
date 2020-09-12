package AtCoder.ABC086

import scala.io.StdIn.readLine

object ABC086A_Product extends App {

  val ab = readLine().split(' ').map(_.toInt)
  val a = ab(0)
  val b = ab(1)

  val res = if (isOdd(a * b)) "Even" else "Odd"
  println(res)

  def isOdd(value: Int) = value % 2 == 0
}
