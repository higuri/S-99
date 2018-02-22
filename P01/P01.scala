/// P01
object P01 {
  // last:
  // - generic (polymorphic) method [parameterized by type].
  def last[A](list0: List[A]): A = {
    return list0.last
  }

  // main:
  def main(args: Array[String]): Unit = {
    //println(last[Int](List(1, 1, 2, 3, 5, 8)))
    // type inference available!
    println(last(List(1, 1, 2, 3, 5, 8)))
  }
}
