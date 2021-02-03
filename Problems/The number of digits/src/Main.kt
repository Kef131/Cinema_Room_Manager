fun main() {
    val input = readLine()!!.toInt()
    when (input) {
        in 0..9 -> print("1")
        in 10..99 -> print("2")
        in 100..999 -> print("3")
        in 1000..9999 -> print("4")
    }
}
