fun main() {
    val leapYear = readLine()!!.toInt()
    if (leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 400 == 0) {
        print("Leap")
    } else {
        print("Regular")
    }
}