package _2_basis

object For {
  def main(args: Array[String]): Unit = {
    val array = Array("I", "like", "Scala");
    // lambda表达式，=>跟java的->
    array.foreach(e => println(e))
    // 如果只有一个参数且只包含一个表达式，无需指明参数
    array.foreach(println)
    // for
    for (elem <- array) {
      println(elem)
    }
  }
}
