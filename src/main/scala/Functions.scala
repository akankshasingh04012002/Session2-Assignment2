class Functions {

  // Function definition using a function literal
  val add: Function2[Int, Int, Int] = new Function2[Int, Int, Int] {
    def apply(num1: Int, num2: Int): Int = num1 + num2
  }
  try {
    add.apply(2, 3)
  }
  catch {
    case e: ArithmeticException =>
      println(s"Error occurred: ${e.getMessage}")
  }

  // Function definition using a function literal
  val sumOfList: Function1[List[Int], Int] = new Function1[List[Int], Int] {
    def apply(list: List[Int]): Int = list.sum
  }
  try {
    sumOfList.apply(List(1, 2, 3, 4, 5))
  }
  catch {
    case e: Exception => println("Exception caught: " + e.getMessage)
  }

  // Higher Order Function definition
  val higherOrderFunction: Function2[Int => Int, Int, Int] =
    new Function2[Int => Int, Int, Int] {
      def apply(func: Int => Int, num: Int): Int = func(num)
    }

  try {
    val result = higherOrderFunction.apply((element: Int) => element * element, 5)
    println(s"higherOrderFunction((element: Int) => element * element, 5) = $result")
  } catch {
    case e: ArithmeticException => println(s"Error: ${e.getMessage}")
  }
}
