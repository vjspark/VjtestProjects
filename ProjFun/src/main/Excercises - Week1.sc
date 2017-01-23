package recfun

object Main {
  //  def main(args: Array[String]) {
  //    println("Pascal's Triangle")
  //    for (row <- 0 to 10) {
  //      for (col <- 0 to row)
  //      print(pascal(col, row) + " ")
  //      println()
  //    }
  //  }

  /**
    * Exercise 1
    */

  def main(args: Array[String]) {

    def pascal(c: Int, r: Int): Int = {

      if (c == 0) 1
      else factorial(r) / (factorial(c)) * factorial(r - c)

    }

    def factorial(n: Int): Int = {
      if (n == 0) 1
      else n * factorial(n - 1)
    }
    pascal(2, 4)
  }

  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = {

    def paranBalance(chars: List[Char], total: Int): Boolean = {
      if (chars.isEmpty) total == 0
      else if (chars.head == '(') paranBalance(chars.tail, total + 1)
      else if (chars.head == ')') total > 0 && paranBalance(chars.tail, total - 1)
      else paranBalance(chars.tail, total)
    }

    paranBalance(chars, 0)
  }

  val stringInput = "((())"
  val chars = stringInput.toList
  balance(chars)

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = {
    if (money == 0) 1
    else if ((money > 0) && !coins.isEmpty)
      countChange(money,coins.tail) + countChange(money-coins.head,coins)
    else 0
  }


}
