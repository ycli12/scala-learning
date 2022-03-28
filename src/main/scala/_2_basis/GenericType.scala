package _2_basis

object GenericType {
  def main(args: Array[String]): Unit = {
    // 1、new创建对象
    // 2、泛型使用[]而不是java的<>
    // 3、数组使用()而不是[]
    val strings = new Array[String](3)
    // 5、Scala将这种赋值转化为该对象的update方法，类似于greetStrings.update(0,"Hello")
    strings(0) = "Hello"
    strings(1) = ","
    strings(2) = "World"
    // 4、0 to 2 实际上为(0).to(2) 调用的为整数类型的 to 方法
    // to是操作符，背后调用方法
    // Scala中所有的基本数据类型也都是对象，和Java不同
    // 实际上Scala表达式1 + 2，最终解释为 (1).+(2)
    for(i <- 0 to 2) {
      print(strings(i))
    }
  }
}
