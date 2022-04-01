package _8_composite_inheritate

class ArrayElement(conts : Array[String]) extends Element {
  //  override def contents: Array[String] = conts

  // 4、Scala 中不允许定义同名的成员函数和成员变量，但带来的一个好处是，
  // 可以使用成员变量来重写一个不带参数的成员函数。
  val contents : Array[String] = conts


}
