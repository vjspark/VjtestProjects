
def balance(chars: List[Char]): Boolean = {

  def paranBalance(chars: List[Char], total: Int): Boolean = {
    if (chars.isEmpty) total == 0
    else if (chars.head == '(') paranBalance(chars.tail, total + 1)
    else if (chars.head == ')') total > 0 && paranBalance(chars.tail, total - 1)
    else paranBalance(chars.tail, total)
  }
  paranBalance(chars,0)
}

val stringInput = "((())"
  val chars = stringInput.toList
  balance(chars)

