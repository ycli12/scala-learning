package _7_function

import java.io.{File, PrintWriter}

object Demo {
  // 4.2、柯里化函数，把接受多个参数的函数变换成接受一个单一参数（最初函数的第一个参数）的
  //      函数，返回接受余下的参数而且返回结果的新函数的技术。
  def plainOldSum(x:Int, y:Int) = x + y

  def curriedSum(x : Int)(y : Int) = x + y

  // 后面的 _ 代表另外一个参数
  val onePlus = curriedSum(1) _

  val twoPlus = curriedSum(2) _

  // 5、创建新的控制结构
  // 如果你调用函数只有一个参数，你可以使用 {} 来替代 ()
  // 以上的语法结合柯里化，先将函数柯里化转化为一个参数的函数，最后就可以使用{}，
  // 这样看起来就像内部的控制结构一样
  def withPrintWriter (file: File, op: PrintWriter => Unit) {
    val writer = new PrintWriter(file)
    try {
      op(writer)
    } finally {
      writer.close()
    }
  }

  // 柯里化
  def withPrintWriter2 (file: File)( op: PrintWriter => Unit) {
    val writer = new PrintWriter(file)
    try{
      op(writer)
    }finally{
      writer.close()
    }
  }

  def main(args: Array[String]): Unit = {
    // 1、函数在Scala中是头等公民
    var increase = (x : Int) => x + 1
    println(increase(10))

    // 2、使用_定义函数，_在函数体中只能出现一次，因此两个_分别代表不同的参数
    val f = (_ : Int) + (_ : Int)

    // 3、尾递归，最后一行是一个递归操作，这个递归操作没有包含当前栈的东西，
    //          因此当前函数的栈可以释放掉，不必积累多个栈
    //    def approximate(guess: Double) : Double =
    //      if (isGoodEnough(guess)) guess
    //      else approximate(improve(guess))

    // 4、Scala 没有内置很多控制结构。这是因为 Scala 赋予了程序员自己扩展控制结构的能力。
    // 4.1、高阶函数，可以传入函数作为参数的函数，高阶函数的意义在于参数不仅仅是固定的值，
    //              还可以是一系列的算法，增加了函数的抽象能力，减少重复代码。

    // 5、这样看起来就像内部的控制结构一样
    val file = new File("date.txt")
    withPrintWriter2(file) {
      writer => writer.println(new java.util.Date)
    }

    // 6、传名参数
    // 上面 => 还是可以看起来像是在入参，因为普通的传参是传值
    // 比如 3 > 5 放到参数的时候，实际上是传入false而不是计
    // 算表达式，如果我们按名称传递参数，那么直接传入表达式。
    // 修改方法是使用 => 开始，而不是 ()=> 来定义函数类型

  }
}
