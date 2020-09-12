package AtCoder.ABC083

import scala.annotation.tailrec
import scala.io.StdIn.readLine

object ABC083B_SomeSums extends App {

  val inNAB = readLine().split(' ').map(_.toInt)
  val N = inNAB(0)
  val A = inNAB(1)
  val B = inNAB(2)

  println(calcSum(0, 0))

  @tailrec
  def calcSum(i: Int, sum: Int): Int = {
    if (i <= N) {
      val sumRow = i.toString.toCharArray.map(_.asDigit).sum
      if (A <= sumRow && sumRow <= B) calcSum(i + 1, sum + i)
      else calcSum(i + 1, sum)
    } else
      sum
  }
}
