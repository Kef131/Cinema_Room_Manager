fun main() {
    val word = readLine()!!
    checkLetter@ for (i in 'a'..'z') {
        for (letter in word) {
            if (letter == i) continue@checkLetter
        }
        print(i)
    }
}