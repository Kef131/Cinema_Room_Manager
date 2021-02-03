fun main() {
    val sizeN = readLine()!!.toInt()
    val arrayN = IntArray(sizeN)
    for (i in 0..arrayN.lastIndex) {
        arrayN[i] = readLine()!!.toInt()
    }
    var triples = 0
    for (i in 0..sizeN - 3) {
        if (arrayN[i] == arrayN[i + 1] - 1 && arrayN[i + 1] == arrayN[i + 2] - 1) {
            triples++
        }
    }
    print(triples)
}
