// P07 (**) Flatten a nested list structure.
//     Example:
// 
//     scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
//     res0: List[Any] = List(1, 1, 2, 3, 5, 8)
object P07 {
  // flatten:
  def flatten(list0: List[Any]): List[Any] = {
    // case 0
    // imperative approach
    /*
    var list1 = List[Any]()
    for (elem <- list0) {
      if (elem.isInstanceOf[List[_]]) {
	list1 = list1 ::: flatten(elem.asInstanceOf[List[Any]])
      } else {
	list1 = list1 ::: List(elem)
      }
    }
    list1
    */

    // case 1
    // imperative approach
    // use 'match' for type matching instead of 'if-else'.
    var list1 = List[Any]()
    for (elem <- list0) {
      elem match {
	case list2: List[_] => list1 = list1 ::: flatten(list2)
	case elem => list1 = list1 ::: List(elem)
      }
    }
    list1
  }

  // main:
  def main(args: Array[String]): Unit = {
    println(flatten(List(List(1, 1), 2, List(3, List(5, 8)))))
  }
}
