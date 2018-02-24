// P05 (*) Reverse a list.
//     Example:
// 
//     scala> reverse(List(1, 1, 2, 3, 5, 8))
//     res0: List[Int] = List(8, 5, 3, 2, 1, 1)

object P05 {
  // reverse: 
  def reverse[A](list0: List[A]): List[A] = {
    // case 0
    // use List API
    list0.reverse

    // case 1
    // imperative style (var - for) with List API
    /*
    var list1 = List[A]()
    for (i <- 0 until list0.length) {
      list1 = list0(i) :: list1
    }
    list1
    */

    // case 2
    // functional style (recursion)
    // [tips]
    // > def :::(prefix: List[A]): List[A]
    // > Adds the elements of a given list in front of this list.
    list0 match {
      case Nil => Nil
      case head :: list1 => reverse(list1) ::: List(head)
    }
  }

  // main:  
  def main(args: Array[String]): Unit = {
    println(reverse(List(1, 1, 2, 3, 5, 8)))
  }
}
