package AtCoder.ABC085

import scala.io.StdIn.readInt

object ABC085B_KagamiMochi extends App {

  val N = readInt()
  val d = for (_ <- 0 until N) yield readInt()

  println(d.sorted.toSet.size)
}
