package AtCoder

/*

  問題文
1 以上 N 以下の整数のうち、 10 進法での各桁の和が A 以上 B 以下であるものの総和を求めてください。

  制約
1 ≤ N ≤ 10^4
1 ≤ A ≤ B ≤ 36
入力はすべて整数である

  入力
入力は以下の形式で標準入力から与えられる。

N
A
B

  出力
1 以上 N 以下の整数のうち、 10 進法での各桁の和が A 以上 B 以下であるものの総和を出力せよ。

  入力例 1
20 2 5

  出力例 1
84
20 以下の整数のうち、各桁の和が 2 以上 5 以下なのは 2 , 3 , 4 , 5 , 11 , 12 , 13 , 14 , 20 です。
これらの合計である 84 を出力します。

  入力例 2
10 1 2

  出力例 2
13

  入力例 3
100 4 16

  出力例 3
4554

 */


import scala.annotation.tailrec
import scala.io.StdIn.readLine

object ABC083B_SomeSums extends App {

  val inNAB = readLine().split(' ').map(_.toInt)
  val N = inNAB(0)
  val A = inNAB(1)
  val B = inNAB(2)

  println(calcSum(0, 0))

  @tailrec
  def calcSum(i: Int, sum: Int): Int = {
    if (i <= N) {
      val sumRow = i.toString.toCharArray.map(_.asDigit).sum
      if (A <= sumRow && sumRow <= B) calcSum(i + 1, sum + i)
      else calcSum(i + 1, sum)
    } else
      sum
  }
}
