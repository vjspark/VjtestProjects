//Paranthesis balancing
object solution2 {
  def balance(chars: List[Char]): Boolean = {
    def balanced(chars: List[Char], total: Int): Boolean = {
      if (chars.isEmpty) total == 0
      else if (chars.head == '(') balanced(chars.tail, total + 1)
      else if (chars.head == ')') total > 0 && balanced(chars.tail, total - 1)
      else balanced(chars.tail, total)
      }

      balanced(chars, 0)
    }

      val Str = "(if )zero? x) max (/ 1 x))"
    //val Str = "("
    val chars = Str.toList
    balance(chars)
  }

