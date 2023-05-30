package Practice

object Functions {
  
  def main(args:Array[String]){
    println("Sum: " + sum(5, 3))
println("Is 10 even? " + isEven(10))
println("Factorial of 4: " + factorial(4))
println("Maximum number in the list [5, 10, 3, 8]: " + findMax(List(5, 10, 3, 8)))
println("Concatenation of 'Hello' and 'World': " + concatenateStrings("Hello", "World"))
println("Average of the list [1.5, 2.5, 3.5]: " + calculateAverage(List(1.5, 2.5, 3.5)))
    
  }
  def sum(a: Int, b: Int): Int = {
  a + b
}

def isEven(number: Int): Boolean = {
  number % 2 == 0
}

def factorial(n: Int): Int = {
  if (n == 0 || n == 1)
    1
  else
    n * factorial(n - 1)
}

def findMax(numbers: List[Int]): Int = {
  numbers.max
}

def concatenateStrings(str1: String, str2: String): String = {
  str1 + str2
}

def calculateAverage(numbers: List[Double]): Double = {
  if (numbers.isEmpty)
    0.0
  else
    numbers.sum / numbers.length
}

}