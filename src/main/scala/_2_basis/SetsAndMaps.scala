package _2_basis

object SetsAndMaps {
  def main(args: Array[String]): Unit = {
    // 1、Scala 语言的一个设计目标是让程序员可以同时利
    // 用面向对象和面向函数的方法编写代码，因此它提供
    // 的集合类分成了可以修改的集合类和不可以修改的集
    // 合类两大类型。比如 Array 总是可以修改内容的，
    // 而 List 总是不可以修改内容的。类似的情况，Scala
    // 也提供了两种 Sets 和 Maps 集合类。

    // 2、Trait就相当于Java的接口
    // 3、可变Set和不可变Set都继承于Set，具体的继承见set.png
    // 4、默认是不可变的set
    var set1 = Set("abc", "def")
    set1 += "ghi"
    println(set1)
    println(set1.contains("abc"))

    // 5、map也跟set一样，都有可变和不可变对象
    val map1 = Map(1 -> "one", 2 -> "two", 3 -> "three")
    println(map1(3))
    // 抛出异常
    println(map1(4))
  }
}
