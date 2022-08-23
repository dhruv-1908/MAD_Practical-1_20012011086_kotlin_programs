import java.util.Scanner
fun main(args: Array<String>) {
    arithmetic()
}

fun arithmetic() {
    val a: Int = 111
    val b: Int = 2222
    val c: Int = -222

    var ans = a + b + c
    println("Addition of $a, $b, $c is $ans")

    ans = a - b - c
    println("Subtraction of $a, $b, $c is $ans")

    ans = a * b * c
    println("Multiplication of $a, $b, $c is $ans")

    ans = b / a
    println("Division of $a, $b is $ans")
}
