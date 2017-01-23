import java.lang.System._
//object Example extends App{
//print ("Hello, World")
//}

object Demo {
  def main(args: Array[String]) {
    def factorial(n:Int):Int  = {
      if (n <= 0)
         1
      else
        (n * factorial(n-1)) }


  print("factorial of 5 is " +factorial(5))

  }
}
//    delayed(time());
// }

//  def time() = {
//    println("Getting time in nano seconds")
//    nanoTime
//  }
//  def delayed( t: => Long ) = {
//    println("In delayed method")
//    println("Param: " + t)
//  }
//}
