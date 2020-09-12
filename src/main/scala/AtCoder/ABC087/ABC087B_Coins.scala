package AtCoder.ABC087

import scala.io.StdIn.readInt

object ABC087B_Coins extends App {

  val A = readInt()
  val B = readInt()
  val C = readInt()
  val X = readInt()

  var pat: Set[String] = Set()
  for (ai <- 0 to A; bi <- 0 to B; ci <- 0 to C) {
    val sum = (ai * 500) + (bi * 100) + (ci * 50)
    if (sum == X) pat += s"$ai$bi$ci"
  }
  println(pat.size)
}
