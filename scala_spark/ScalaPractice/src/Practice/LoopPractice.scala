package Practice


object LoopPractice {
  def printNumbersUpTo(n: Int): Unit = {
    for (i <- 1 to n) {
      println(i)
    }
  }

  def printEvenNumbersUpTo(n: Int): Unit = {
    for (i <- 1 to n if i % 2 == 0) {
      println(i)
    }
  }

  def printNumbersUsingWhile(n: Int): Unit = {
    var i = 1
    while (i <= n) {
      println(i)
      i += 1
    }
  }

  def main(args: Array[String]): Unit = {
    val limit = 5
    println("Printing numbers up to " + limit + ":")
    printNumbersUpTo(limit)

    println("Printing even numbers up to " + limit + ":")
    printEvenNumbersUpTo(limit)

    println("Printing numbers using while loop up to " + limit + ":")
    printNumbersUsingWhile(limit)
  }
}
