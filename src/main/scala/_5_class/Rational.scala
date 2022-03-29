package _5_class

// 1、Scala 的类定义可以有参数，称为类参数，
// 如上面的 n、d。Scala 使用类参数，并把
// 类定义和主构造函数合并在一起，在定义类的
// 同时也定义了类的主构造函数。因此 Scala
// 的类定义相对要简洁些。
class Rational(n:Int, d:Int) {
  val number = n
  val denom = d

  // 4、辅助构造函数，限制辅助构造函数最后只能调用主构造函数
  def this(n : Int) = this(n, 1)

  // 2、构造代码块
  println("Created " + n + "/" + d)

  // 3、这个类限制d不能为0，不然报错！
  require(d != 0)

  override def toString: String = n + "/" + d

//  def add(that : Rational): Rational = new Rational(n * that.d + d * that.n, d * that.d)
  def add(that : Rational): Rational = new Rational(
    number * that.denom + denom * that.number, denom * that.denom
  )

  def lessThan(that : Rational) : Boolean = number * that.denom < that.number * denom

  // 6、运算符
  def +(that : Rational) = add(that)
}

object Rational {
  def main(args: Array[String]): Unit = {
    val oneHalf = new Rational(1, 2)
    val twoThirds = new Rational(2, 3)
    println(oneHalf.add(twoThirds))

    // 7、隐式类型转化使得int + Rational的操作合法
    implicit def intToRational(x : Int) = new Rational(x)
    println(1 + oneHalf)

    // 分母为0，报错
//    new Rational(1, 0)

  }
}