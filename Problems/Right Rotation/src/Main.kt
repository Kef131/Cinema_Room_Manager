fun main() {
    val sizeN = readLine()!!.toInt()
    var arrayN = IntArray(sizeN)
    for (i in 0..arrayN.lastIndex) {
        arrayN[i] = readLine()!!.toInt()
    }
    val rightShift = readLine()!!.toInt()
    repeat(rightShift % sizeN) {
        val tempArray = IntArray(sizeN)
        tempArray[0] = arrayN[arrayN.lastIndex]
        var index = 1
        for (j in 0 until arrayN.lastIndex) {
            tempArray[index] = arrayN[j]
            index++
        }
        arrayN = tempArray
    }
    for (num in arrayN) {
        print("$num ")
    }

}