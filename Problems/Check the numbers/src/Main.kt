fun main() {
    val sizeArray = readLine()!!.toInt()
    val array = IntArray(sizeArray)
    for (i in 0 until sizeArray) {
        array[i] = readLine()!!.toInt()
    }
    val (mString, pString) = readLine()!!.split(" ")
    val m = mString.toInt()
    val p = pString.toInt()
    var found = false
    for (i in 0 until sizeArray - 1) {
        if (array[i] == m && array[i + 1] == p || array[i] == p && array[i + 1] == m) {
            found = true
        }
    }
    if (found) {
        print("NO")
    } else {
        print("YES")
    }
}