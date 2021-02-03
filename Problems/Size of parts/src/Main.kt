fun main() {
    val numberParts = readLine()!!.toInt()
    var fixed = 0
    var reject = 0
    var ready = 0
    repeat(numberParts) {
        val part = readLine()!!.toInt()
        if (part == 1) {
            fixed++
        } else if (part == -1) {
            reject++
        } else if (part == 0) {
            ready++
        }
    }
    print("$ready $fixed $reject")
}
