package AtCoder

/*

  問題文
高橋君はデータの加工が行いたいです。

整数 a , b , c と、文字列 s が与えられます。
a + b + c の計算結果と、文字列 s を並べて表示しなさい。

  入力
入力は以下の形式で与えられる。

a
b c
s

  出力
a + b + c と s を空白区切りで1行に出力せよ。

  入力例 1
1
2 3
test

  出力例 1
6 test
1 + 2 + 3は 6 なので、上記のように出力します。

  入力例 2
72
128 256
myonmyon

  出力例 2
456 myonmyon
72 + 128 + 256 は 456 なので、上記のように出力します。

*/

import scala.io.StdIn.{readInt, readLine}

object PracticeA extends App {

  val a = readInt()
  val bc = readLine().split(' ').map(_.toInt)
  val b = bc(0)
  val c = bc(1)
  val s = readLine()

  println(s"${a + b + c} $s")
}
