// P03 (*) Find the Kth element of a list.
//    By convention, the first element in the list is element 0.
//
//    Example:
//
//    scala> nth(2, List(1, 1, 2, 3, 5, 8))
//    res0: Int = 2
object P03 {
  def nth[A](i: Int, list0: List[A]): A = {
    // case 0
    // use List API
    /*
    list0(i)
    */

    // case 1
    // imperative style (var - for - return)
    /*
    var j = 0
    list0.foreach((elem => {
      if (i == j) return elem
      j += 1
    }))
    throw new Exception
    */

    // case 2
    // functional style (recursion)
    (i, list0) match {
      case (0, elem0 :: list1) => elem0
      case (n, elem0 :: list1) => nth(n-1, list1)
      case _ => throw new Exception
    }
  }

  // main:
  def main(args: Array[String]): Unit = {
    println(nth(2, List(1, 1, 2, 3, 5, 8)))
  }
}
