package AtCoder

import scala.annotation.tailrec
import scala.io.StdIn.{readInt, readLine}

object ABC086C_Traveling extends App {

  val N = readInt()
  val txy = Array(0, 0, 0) +: (for (_ <- 0 until N) yield readLine().split(' ').map(_.toInt))

  if (isReachable) println("Yes")
  else println("No")

  def arrayToTuple3(array: Array[Int]): (Int, Int, Int) = (array(0), array(1), array(2))

  def isReachable: Boolean = {
    for (i <- 1 to N) {
      val (nt, nx, ny) = arrayToTuple3(txy(i))

      @tailrec
      def calcReachable(current: (Int, Int, Int)): Boolean = {
        val (ct, cx, cy) = current
        if (ct < nt)
          if (cx < nx) calcReachable((ct + 1, cx + 1, cy))
          else if (cy < ny) calcReachable((ct + 1, cx, cy + 1))
          else if (nx < cx) calcReachable((ct + 1, cx - 1, cy))
          else if (ny < cy) calcReachable((ct + 1, cx, cy - 1))
          else calcReachable((ct + 1, cx - 1, cy))
        else
          cx == nx && cy == ny
      }

      if (!calcReachable(arrayToTuple3(txy(i - 1)))) return false
    }
    true
  }
}
