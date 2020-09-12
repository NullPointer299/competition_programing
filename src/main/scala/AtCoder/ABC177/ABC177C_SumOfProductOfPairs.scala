package AtCoder.ABC177

import scala.io.StdIn.{readInt, readLine}

object ABC177C_SumOfProductOfPairs extends App {

  val n = readInt()
  val in = readLine().split(' ')
  val a = Array.fill(n)(0)
  val b = Array.fill(n + 1)(0L)
  val mod = 1000000007

  for (i <- 0 until n) {
    a(i) = in(i).toInt
    b(i + 1) = b(i) + a(i)
  }

  var ans = 0L

  for (i <- 0 until n) {
    val sum = (b(n) - b(i + 1)) % mod

    ans += a(i) * sum
    ans %= mod
  }
  println(ans)
}
