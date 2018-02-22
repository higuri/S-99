/// P01
object P01 {
  // last:
  // - generic (polymorphic) method [parameterized by type].
  def last[A](list0: List[A]): A = {
    list0 match {
      case h :: Nil => h
      case _ :: tail => last(tail)
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
