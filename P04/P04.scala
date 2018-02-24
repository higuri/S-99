// P04 (*) Find the number of elements of a list.
//    Example:
//
//    scala> length(List(1, 1, 2, 3, 5, 8))
//    res0: Int = 6

object P04 {
  // length:
  def length[A](list0: List[A]): Int = {
    // case 0
    // use List API
    /*
    list0.length
    */

    // case 1
    // imperative style (var - for)
    /*
    var n = 0
    for (_ <- list0) n += 1
    n
    */

    // case 2
    // functional style (recursion)
    list0 match {
      case Nil => 0
      case elem0 :: list1 => 1 + length(list1)
    }
  }

  // main:
  def main(args: Array[String]): Unit = {
    println(length(List(1, 1, 2, 3, 5, 8)))
  }
}
