/// P01
object P01 {
  // last:
  // * generic (polymorphic) method [parameterized by type].
  def last[A](list0: List[A]): A = {
    // use list pattern match.
    // * list is built from
    //   elem0 :: elem1 :: elem2 :: Nil
    //   [Nil terminated].
    list0 match {
      // e.g. 8 :: Nil
      case head :: Nil => head
      // e.g. 1 :: List(1, 2, 3, 5, 8)
      case head :: list1 => last(list1)
      case _         => throw new Exception
    }
  }

  // main:
  def main(args: Array[String]): Unit = {
    //println(last[Int](List(1, 1, 2, 3, 5, 8)))
    // type inference available!
    println(last(List(1, 1, 2, 3, 5, 8)))
  }
}
