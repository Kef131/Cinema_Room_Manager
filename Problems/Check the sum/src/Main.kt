import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    println(a + b == 20 || a + c == 20 || b + c == 20)
}