fun main() {
    val word = readLine()!!
    for (i in word) {
        if (i.isDigit()) {
            print(i)
            break
        }
    }
}