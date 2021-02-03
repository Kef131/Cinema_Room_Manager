fun main() {
    var n = readLine()!!.toInt()
    var collatzString: String = "$n "
    while (n != 1) {
        if (n % 2 == 0) {
            n /= 2
            collatzString += "$n "
        } else {
            n = n * 3 + 1
            collatzString += "$n "
        }
    }
    println(collatzString)
}