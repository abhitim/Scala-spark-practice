package Practice

object ElseIfPractice {
  def checkSign(number: Int): String = {
    if (number > 0)
      "Positive"
    else if (number < 0)
      "Negative"
    else
      "Zero"
  }

  def checkDivisibility(number: Int): String = {
    if (number % 2 == 0) {
      if (number % 3 == 0)
        "Divisible by both 2 and 3"
      else
        "Divisible by 2 only"
    } else if (number % 3 == 0) {
      "Divisible by 3 only"
    } else {
      "Not divisible by 2 or 3"
    }
  }

  def getMax(a: Int, b: Int): Int = {
    if (a > b) a else b
  }

  def checkVowel(character: Char): String = {
    val vowels = Set('a', 'e', 'i', 'o', 'u')
    if (vowels.contains(character.toLower))
      "Vowel"
    else
      "Consonant"
  }

  def main(args: Array[String]): Unit = {
    val number = 10
    println(s"Sign of $number: " + checkSign(number))

    val divisibleNumber = 9
    println(s"Divisibility of $divisibleNumber: " + checkDivisibility(divisibleNumber))

    val a = 5
    val b = 8
    println(s"Maximum of $a and $b: " + getMax(a, b))

    val character = 'A'
    println(s"Type of character '$character': " + checkVowel(character))
  }
}
