package AtCoder

/*

  問題文
N 枚のカードがあります. i 枚目のカードには, ai という数が書かれています.
Alice と Bob は, これらのカードを使ってゲームを行います.
ゲームでは, Alice と Bob が交互に 1 枚ずつカードを取っていきます. Alice が先にカードを取ります.
2 人がすべてのカードを取ったときゲームは終了し, 取ったカードの数の合計がその人の得点になります.
2 人とも自分の得点を最大化するように最適な戦略を取った時, Alice は Bob より何点多く取るか求めてください.

  制約
N は 1 以上 100 以下の整数
ai ( 1 ≤ i ≤ N ) は 1 以上 100 以下の整数

  入力
入力は以下の形式で標準入力から与えられる.

N
a1 a2 a3 . . . aN

  出力
両者が最適な戦略を取った時, Alice は Bob より何点多く取るかを出力してください.

  入力例 1
2
3 1

  出力例 1
2
最初, Alice は 3 が書かれたカードを取ります.
次に, Bob は 1 が書かれたカードを取ります. 得点差は 3 - 1 = 2 となります.

  入力例 2
3
2 7 4

  出力例 2
5
最初, Alice は 7 が書かれたカードを取ります.
次に, Bob は 4 が書かれたカードを取ります.
最後に, Alice は 2 が書かれたカードを取ります.
得点差は, 7 - 4 + 2 = 5 点となります.

  入力例 3
4
20 18 2 18

  出力例 3
18

 */


import scala.annotation.tailrec
import scala.io.StdIn.{readInt, readLine}

object ABC088B_CardGameForTwo extends App {

  val N = readInt()
  val aN = readLine().split(' ').map(_.toInt).sortWith(_ > _)

  //    var alice = 0
  //    var bob = 0
  //
  //    for (i <- aN.indices)
  //      if (i % 2 == 0) alice += aN(i)
  //      else bob += aN(i)
  //
  //    println(alice - bob)

  val aliceAndBob = calcScore(0, 0, 0)

  println(aliceAndBob._1 - aliceAndBob._2)

  @tailrec
  def calcScore(i: Int, alice: Int, bob: Int): (Int, Int) = {
    if (i < aN.length)
      if (i % 2 == 0)
        calcScore(i + 1, alice + aN(i), bob)
      else
        calcScore(i + 1, alice, bob + aN(i))
    else
      (alice, bob)
  }
}
