
def factorial(n: Int): Int = {

  def loop(accu: Int, n: Int): Int =
    if (accu == 0) accu else loop(accu * n, n - 1)

  loop(1, n)
}

factorial(3)

