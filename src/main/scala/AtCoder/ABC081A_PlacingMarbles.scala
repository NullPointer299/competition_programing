package AtCoder

/*

  問題文
すぬけ君は1, 2, 3 の番号がついた3つのマスからなるマス目を持っています。 各マスには 0 か 1 が書かれており、
マス i には si が書かれています。

すぬけ君は 1 が書かれたマスにビー玉を置きます。 ビー玉が置かれるマスがいくつあるか求めてください。

  入力
入力は以下の形式で標準入力から与えられる。

s1 s2 s3

  出力
答えを出力せよ。

  入力例 1
101

  出力例 1
2
マス1, 3にビー玉が置かれます

  入力例 2
000

  出力例 2
0
ビー玉はどのマスにも置かれません

*/

import scala.io.StdIn.readLine

object ABC081A_PlacingMarbles extends App {

  val in = readLine().toCharArray.map(_.toString.toInt)
  println(in.count(_ == 1))
}
