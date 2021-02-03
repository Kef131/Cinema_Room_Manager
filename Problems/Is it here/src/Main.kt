/*
fun main() {
    val n = readLine()!!.toInt()
    val nList = mutableListOf<Int>()
    repeat(n) {
        nList.add(readLine()!!.toInt())
    }
    if (nList.contains(readLine()!!.toInt())) {
        print("YES")
    } else {
        print("NO")
    }
}
*/
fun main() {
    val n = readLine()!!.toInt()
    val intArray = IntArray(n)
    for (i in 0..n - 1) {
        intArray[i] = readLine()!!.toInt()
    }
    val m = readLine()!!.toInt()
    var found = false
    for (i in intArray.lastIndex downTo 0) {
        if (intArray[i] == m) {
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