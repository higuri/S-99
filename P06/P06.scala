// P06 (*) Find out whether a list is a palindrome.
//     Example:
// 
//     scala> isPalindrome(List(1, 2, 3, 2, 1))
//     res0: Boolean = true
object P06 {
  // isPalindrome:
  def isPalindrome[A](list0: List[A]): Boolean = {
    // case 0
    // use List API
    list0 == list0.reverse

    // case 1
    // imperative style 
    /*
    val mid = list0.length / 2
    for (i <- 1 to mid) {
      val iLeft = mid - i
      val iRight = {
	if (list0.length % 2 == 0) mid - 1 + i
	else mid + i
      }
      if (list0(iLeft) != list0(iRight)) return false
    }
    true
    */
  }

  // main:
  def main(args: Array[String]): Unit = {
    println(isPalindrome(List(4, 2, 2, 4)))
    println(isPalindrome(List(4, 2, 2, 5)))
    println(isPalindrome(List(2, 3, 2)))
    println(isPalindrome(List(1, 2, 3, 2, 1)))
    println(isPalindrome(List(1, 2, 3, 2, 2)))
  }
}
