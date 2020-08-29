package AtCoder

import scala.io.StdIn.readLine

object ABC085C_Otoshidama extends App {

  val NY = readLine.split(' ').map(_.toInt)
  val (x, y, z) = findPattern(NY(0), NY(1))
  println(s"$x $y $z")

  def findPattern(N: Int, Y: Int): (Int, Int, Int) = {
    for (x <- 0 to N; y <- 0 to N - x)
      if (10000 * x + 5000 * y + 1000 * (N - x - y) == Y)
        return (x, y, N - x - y)
    (-1, -1, -1)
  }
}
