package AtCoder

/*

  問題文
シカのAtCoDeerくんは二つの正整数 a , b を見つけました。
a と b の積が偶数か奇数か判定してください。

  入力
入力は以下の形式で標準入力から与えられる。

a b

  出力
積が奇数なら Odd と、偶数なら Even と出力せよ。

  入力例 1
3 4

  出力例 1
Even

3 × 4 = 12 は偶数なので Even を出力してください。

  入力例 2
1 21

  出力例 2
Odd
1 × 21 = 21 は奇数なので Odd を出力してください。

*/

import scala.io.StdIn.readLine

object ABC086A extends App {

  val ab = readLine().split(' ').map(_.toInt)
  val a = ab(0)
  val b = ab(1)

  val res = if (isOdd(a * b)) "Even" else "Odd"
  println(res)

  def isOdd(value: Int) = value % 2 == 0
}
