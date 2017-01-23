
val chars = "(if (zero? x) max (/ 1 x))".toList.filter(Set('(', ')'))
var tot = 0
for (i <- 0 to chars.length - 1)
  {
    if chars(i) == "("
         tot += 1
         if to < 0 false
    else
        tot += -1
         if tot < 0 false
  }

chars.reduceLeft(x: Char, y: Char,tot: Int) =  {
if (x == "(")  total += 1 else total -= 1)

}


object solution {

  def pascal(c: Int, r: Int): Int = {

    if (c == 0) 1
    else
      factorial(r) / (factorial(c) * factorial(r - c))}

  def factorial(x: Int): Int =
      if (x == 0) 1 else x * factorial(x - 1)

  pascal(5, 7)

}




*