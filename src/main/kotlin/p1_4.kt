import java.util.Scanner

fun main(args: Array<String>) {

    val read = Scanner(System.`in`)
    println("Enter number ")
    val n =read.nextInt()
    val ans = if(n%2 ==0){
        "Number is  Even"
    }else{
        "Number is odd"
    }
    println(ans)
}
