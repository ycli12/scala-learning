package _6_control

object Demo {

  // 使用递归代替break
  def search1(string : String, start: Int) : Int = {
    if (start == string.length) {
      -1;
    }

    if (string(start) == '1') {
      start;
    } else {
      search1(string, start + 1);
    }
  }

  def main(args: Array[String]): Unit = {
    // 1、Scala没有break、continue怎么办？
    //    函数化编程使用递归实现
    println(search1("76123", 0))
  }
}
