package AtCoder

import scala.io.StdIn.readLine

object ABC085C_Otoshidama extends App {

  val NY = readLine.split(' ').map(_.toInt)
  val (x, y, z) = findPattern(NY(0), NY(1))
  println(s"$x $y $z")

  def findPattern(N: Int, Y: Int): (Int, Int, Int) = {
    for (t10 <- 0 to N; t5 <- 0 to N - t10)
      if (10000 * t10 + 5000 * t5 + 1000 * (N - t10 - t5) == Y)
        return (t10, t5, N - t10 - t5)
    (-1, -1, -1)
  }
}
