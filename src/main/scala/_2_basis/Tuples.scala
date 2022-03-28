package _2_basis

object Tuples {
  def main(args: Array[String]): Unit = {
    // 1、和 List 不同的是，Tuples 可以包含不同类型的数据，
    // 而 List 只能包含同类型的数据。Tuples 在方法需要返回
    // 多个结果时非常有用。Tuple 对应到数学的 矢量 的概念。
    val pair = (99, "abc")

    // 2、一旦定义了一个元组，可以使用 ._ 和 索引 来访问元组
    // 的元素。矢量的分量，注意和数组不同的是，元组的索引从 1
    // 开始。
    println(pair._1)
    println(pair._2)

    // 3、元组的实际类型取决于它的分量的类型，比如上面 pair 的
    // 类型实际为 Tuple2[Int,String]，而 (‘u’,’r’,”the”,1,4,”me”)
    // 的类型为 Tuple6[Char,Char,String,Int,Int,String]。
  }
}
