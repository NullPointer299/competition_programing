package AtCoder.ABC088

import scala.annotation.tailrec
import scala.io.StdIn.{readInt, readLine}

object ABC088B_CardGameForTwo extends App {

  val N = readInt()
  val aN = readLine().split(' ').map(_.toInt).sortWith(_ > _)

  //    var alice = 0
  //    var bob = 0
  //
  //    for (i <- aN.indices)
  //      if (i % 2 == 0) alice += aN(i)
  //      else bob += aN(i)
  //
  //    println(alice - bob)

  val aliceAndBob = calcScore(0, 0, 0)

  println(aliceAndBob._1 - aliceAndBob._2)

  @tailrec
  def calcScore(i: Int, alice: Int, bob: Int): (Int, Int) = {
    if (i < aN.length)
      if (i % 2 == 0)
        calcScore(i + 1, alice + aN(i), bob)
      else
        calcScore(i + 1, alice, bob + aN(i))
    else
      (alice, bob)
  }
}
