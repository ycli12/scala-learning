package _8_composite_inheritate

abstract class Element {
  // 1、只有声明，不需要使用abstract修饰符，没有定义方法体，因此是抽象类
  def contents : Array[String]
  // 2、这几个方法都没有参数列表，甚至连个空列表都没有
  def height : Int = contents.length
  def width : Int = if (height == 0) 0 else contents(0).length
  // 3、Scala 里定义不带参数也没有副作用的方法为无参数方法。也就是说，省略空
  // 的括号是鼓励的风格。另一方面，永远不要定义没有括号的带副作用的方法，因
  // 为那样的话，方法调用看上去会像选择一个字段。
  "hello".length  // 没有副作用，省略空括号
  println() // 有副作用，不省略空括号

}
