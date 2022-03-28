package _2_basis

object Lists {
  def main(args: Array[String]): Unit = {
    // 1、Scala 也是一个面向函数的编程语言，面向函数的编程语言的一个特点是，
    // 调用某个方法不应该有任何副作用，参数一定，调用该方法后，返回一定的
    // 结果，而不会去修改程序的其它状态（副作用）。这样做的一个好处是方法
    // 和方法之间关联性较小，从而方法变得更可靠和重用性高。使用这个原则也
    // 就意味着需要把变量设成不可修改的，这也就避免了多线程访问的互锁问题。

    // 2、Scala的List有点像Java的String，都是不可变的
    // 3、::: 将两个list连接成一个
    val list1 = List(1, 2)
    val list2 = List(3, 4)
    val concatList: List[Int] = list1 ::: list2
    println("因为 " + list1 + "和" + list2 + "都是不可变的")
    println("因此 " + concatList + "是一个新的list")

    // 4、::用来向List添加一个元素，::是右操作符，因此操作的顺序是先从Nil开始
    val list3: List[Int] = 1 :: 2 :: 3 :: Nil
    println(list3)

    // 5、上面的操作等价于
    val list4: List[Int] = Nil.::(3).::(2).::(1)
    println(list4)

    // 6、Scala 的 List 类还定义了其它很多很有用的方法，比如 head、last、length、reverse、tail 等
  }
}
