package _3_class_object

// 1、可以看到 Scala 类定义和 Java 非常类似，
// 也是以 class 开始，和 Java 不同的，Scala
// 的缺省修饰符为public，也就是如果不带有访问范
// 围的修饰符 public、protected、private 等，
// Scala 将默认定义为 public。
class CheckSumAccumulator {
  private var sum = 0

  // 2、类的方法以 def 定义开始，要注意的是 Scala 的方法的
  // 参数都是 val类型，而不是 var 类型，因此在函数体内不可以
  // 修改参数的值

  // 3、Scala 代码无需使用 ； 结尾，也不需要使用 return 返回值，函数的最后一行的值就作为函数的返回值。
  def add(b:Byte) = sum += b
  def checkSum() : Int = ~(sum & 0xFF) + 1
}


object ChecksumAccumulator {
  private val cache = Map [String, Int] ()

  def calculate(s:String) : Int = {
    if(cache.contains(s))
      cache(s)
    else {
      val acc = new CheckSumAccumulator
      for( c <- s)
        acc.add(c.toByte)
      val cs = acc.checkSum()
      cache += ( s -> cs)
      cs
    }
  }
}