/// P01
object P01 {
  // [tips]
  // def func[A](_: List[A]): A
  //   generic (polymorphic) method [parameterized by type].
  //   usage: func[Int](List(1,2,3))
  //          (type inference available)
  //          func(List(1,2,3))
  def last[A](list0: List[A]): A = {
    // case 0.
    // use List API
    /*
    list0.last
    */

    // case 1.
    // use another List API
    /*
    list0(list0.length - 1)
    */

    // case 2.
    // imperative style (var - for)
    /*
    var retval = list0(0)
    for (elem <- list0) {
      retval = elem
    }
    retval
    */

    // case 3.
    // another imperative style (var - foreach)
    // [tips]
    // * underscore(_) is a placeholder for parameters in anonymous functions.
    // * 'retval = _' is a function value and is a kind of closures,
    //    which closes a free variable 'retval'.
    /*
    var retval = list0(0)
    //list0.foreach( retval = _ )
    // [tips]
    // * you can write foreach argument like these
    //list0.foreach( (e: A) => retval = e )
    //list0.foreach( e => retval = e )
    //list0.foreach {
    //  e => retval = e
    //}
    // * follwing line represents clearly that
    //   we pass 'function value' to foreach function.
    //list0.foreach( { retval = _ } )
    retval
    */

    // case 4.
    // use list pattern match.
    // * list is built from
    //   elem0 :: elem1 :: elem2 :: Nil [Nil terminated].
    list0 match {
      // e.g. 8 :: Nil
      case head :: Nil => head
      // e.g. 1 :: List(1, 2, 3, 5, 8)
      case head :: list1 => last(list1)
      case _         => throw new Exception
    }

    // case 5.
    // another list pattern match.
    // * without knowledge that List is Nil terminated.
    /*
    list0 match {
      case List(elem0) => elem0
      case elem0 :: list1  => last(list1)
      case _ => throw new Exception
    }
    */

    // case 6.
    // yet another list pattern match (but this uses list API).
    // * use pattern guard (case ... if ...).
    /*
    list0 match {
      case list1 if list1.length == 1 => list1(0)
      case list1 if 1 < list1.length => last(list1.drop(1))
      case _ => throw new Exception
    }
    */
  }

  // main:
  def main(args: Array[String]): Unit = {
    println(last(List(1, 1, 2, 3, 5, 8)))
  }
}
