fun main() {
    val word = readLine()!!
    var counter = 0
    nextChar@ for ((indexBase, char) in word.withIndex()) {
        for ((index, checkChar) in word.withIndex()) {
            if (char == checkChar && indexBase != index) continue@nextChar
        }
        counter ++
    }
    print(counter)
}