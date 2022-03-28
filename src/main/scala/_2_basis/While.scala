package _2_basis;

object While {
    def main(args: Array[String]): Unit = {
        // 1、val定义不可变值，var定义变量
        // PS：Array是一种半生对象的初始化方法apply，里面实际上有一个new方法
        val array = Array("I", "like", "scala")
        var i = 0
        while (i < array.length) {
            // 2、Scala访问数组的语法是()而非[]
            // 因为scala的数组也是对象，实际上是调用array.apply(i)方法
            println(array(i))
            i += 1;
        }
    }
}
