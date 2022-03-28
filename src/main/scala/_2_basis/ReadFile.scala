package _2_basis

// 可以看到 Scala 引入包的方式和 Java 类似，
// 也是通过 import 语句。文件相关的类定义在
// scala.io 包中。如果需要引入多个类，Scala
// 使用 _ 而非 *。
import scala.io.{BufferedSource, Source}

object ReadFile {
  def main(args: Array[String]): Unit = {
    val args: BufferedSource = Source.fromFile("C:\\java\\scala-learning\\src\\main\\scala\\_2_basis\\ReadFile.scala")
    args.getLines().foreach(println)
  }
}
