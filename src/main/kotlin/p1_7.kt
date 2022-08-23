import java.util.Scanner
fun main(args: Array<String>)
{
    print("Enter Number: ")
    val read = Scanner(System.`in`)
    val n = read.nextInt()
    println("Factorial of $n = ${simpleFactorial(n)}")
    println("By TailRec Keyword, Factorial of $n = ${factorial(n)}")
}

fun simpleFactorial(n:Int): Long {
    if (n >= 1)
        return n * simpleFactorial(n-1)
    else
        return 1
}

tailrec fun factorial(n: Int, run: Int = 1): Long {
    return if (n == 1) run.toLong() else factorial(n-1, run*n)
}
