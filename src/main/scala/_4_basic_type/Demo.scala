package _4_basic_type

object Demo {
  def main(args: Array[String]): Unit = {
    // 1、隐式自动转换的概念将在后面介绍，简单的说就是可以
    // 为基本类型提供扩展，比如调用 (-1).abs()，Scala 发
    // 现基本类型 Int 没有提供 abs() 方法，但可以发现系统
    // 提供了从 Int 类型转换为 RichInt 的隐式自动转换，而
    // RichInt 具有 abs 方法，那么 Scala 就自动将 1 转换
    // 为 RichInt 类型，然后调用 RichInt 的 abs 方法。

    // Scala 的 == 和 Java 不同，scala 的 == 只用于比较
    // 两个对象的值是否相同。而对于引用类型的比较使用另外的操
    // 作符 eq 和 ne。
  }
}
