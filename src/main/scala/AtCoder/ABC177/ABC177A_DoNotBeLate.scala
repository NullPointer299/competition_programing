package AtCoder.ABC177

import scala.io.StdIn.readLine

object ABC177A_DoNotBeLate extends App {

  val dts = readLine.split(' ').map(_.toInt)
  if (dts(0) <= dts(1) * dts(2)) println("Yes")
  else println("No")
}
