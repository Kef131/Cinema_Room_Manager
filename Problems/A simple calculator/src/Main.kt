fun main() {
    var (val1, op, val2) = readLine()!!.split(" ")
    val long1 = val1.toLong()
    val long2 = val2.toLong()
    when (op) {
        "+" -> print(long1 + long2)
        "-" -> print(long1 - long2)
        "/" -> {
            if (long2 == 0L) {
                print("Division by 0!")
            } else {
                print(long1 / long2)
            }
        }
        "*" -> print(long1 * long2)
        else -> print("Unknown operator")
    }
}