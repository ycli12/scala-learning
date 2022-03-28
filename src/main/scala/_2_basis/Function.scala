package _2_basis

object Function {
  // 1、函数定义，变量类型和返回值类型都放在:后面
  // 3、Scala可以进行类型推断，因此有些类型可以省略
  def max(x : Int, y : Int) : Int = {
    // 2、每个表达式都有返回的结果，包括if/else
    if (x > y) {
      x
    } else {
      y
    }
  }

  // 4、下面定义了一个没有返回值的结果，也就是返回值为Unit，相当于void
  def greet() = println("hello, world!")

  def main(args: Array[String]): Unit = {
    println(max(1, 2));
    greet()
  }
}
