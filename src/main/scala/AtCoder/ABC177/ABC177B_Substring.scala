package AtCoder.ABC177

import scala.io.StdIn.readLine

object ABC177B_Substring extends App {

  val s = readLine().toCharArray
  val t = readLine().toCharArray

  var matchCount = 0

  for (i <- 0 to s.length - t.length) {
    var cnt = 0
    for (j <- 0 until t.length)
      if (s(i + j) == t(j)) cnt += 1
    if (matchCount < cnt) matchCount = cnt
  }
  println(t.length - matchCount)
}
