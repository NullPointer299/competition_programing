package AtCoder.ABC081

import scala.annotation.tailrec
import scala.io.StdIn.{readInt, readLine}

object ABC081B_ShiftOnly extends App {

  val N = readInt()
  val in = readLine().split(' ').map(_.toInt)

  println(countOperation(0, in))

  @tailrec
  def countOperation(count: Int, ary: Array[Int]): Int = {
    if (ary.exists(_ % 2 == 1)) count
    else countOperation(count + 1, ary.map(_ / 2))
  }
}
