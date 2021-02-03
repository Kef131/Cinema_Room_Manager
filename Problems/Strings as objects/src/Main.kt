import kotlin.text.first as first

fun main() {
    var input = readLine()!!
    if( input.isEmpty()) {
        println("")
    } else {
        if (input.first() == 'i') {
            input = input.drop(1)
            println("${input.toInt() + 1}")
        } else if (input.first() == 's') {
            input = input.drop(1)
            input = input.reversed()
            println(input)
        } else {
            println(input)
        }
    }
    // ft
}