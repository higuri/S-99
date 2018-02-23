// P02.scala
// P02 (*) Find the last but one element of a list.
//   Example:
//
//    scala> penultimate(List(1, 1, 2, 3, 5, 8))
//    res0: Int = 5

object P02 {
  // penultimate:
  def penultimate[A](list0: List[A]): A = {
    // case0
    // use List API.
    /*
    list0(list0.length - 1)
    */

    // case 1
    // use List patter matching
    list0 match {
      case elem0 :: elem1 :: Nil => elem0
      case elem0 :: list1 => penultimate(list1)
      case _ => throw new Exception
    }
  }

  // main
  def main(args: Array[String]): Unit = {
    println(penultimate(List(1, 1, 2, 3, 5, 8)))
  }
}
