import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    val size = scanner.nextInt()
    val arrayN = IntArray(size)
    for (i in 0..arrayN.lastIndex) {
        arrayN[i] = scanner.nextInt()
    }
    val m = scanner.nextInt()
    val p = scanner.nextInt()
    var found = false
    for (i in arrayN.lastIndex downTo 1) {
        if (arrayN[i] == m && arrayN[i - 1] == p || arrayN[i] == p && arrayN[i - 1] == m) {
            found = true
            break
        }
    }
    if (found) {
        print("YES")
    } else {
        print("NO")
    }
}