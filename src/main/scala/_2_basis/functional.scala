package _2_basis

object functional {
  def main(args: Array[String]): Unit = {
    // 1、一个简单的原则，如果代码中含有 var 类型
    // 的变量，这段代码就是传统的指令式编程，如果
    // 代码只有 val 变量，这段代码就很有可能是函
    // 数式代码，因此学会函数式编程关键是不使用 var 来编写代码。

    printArgs(Array("1", "2", "3"))
    printArgs2(Array("1", "2", "3"))
    printArgs3(Array("1", "2", "3"))
  }

  // 2、来自 Java 背景的程序员开始写 Scala 代码很有可能写成上面的实现。
  def printArgs(args : Array[String]) = {
    var i = 0
    while (i < args.length) {
      println(args(i))
      i += 1
    }
  }

  // 3、我们试着去除 var 变量，可以写成更符合函数式编程的代码：
  def printArgs2(args : Array[String]) = {
    for (elem <- args)
      println(elem)
  }

  // 4、我们试着去除 var 变量，可以写成更符合函数式编程的代码：
  // 5、这个例子也说明了尽量少用 var 的好处，代码更简洁明了，
  // 从而也可以减少错误的发生。因此 Scala 编程的一个基本原则
  // 是，能不用 var，尽量不用 var，能不用 mutable 变量，尽
  // 量不用 mutable 变量，能避免函数的副作用，就尽量不产生副
  // 作用。
  def printArgs3(args : Array[String]) = {
    args.foreach(println)
  }
}
