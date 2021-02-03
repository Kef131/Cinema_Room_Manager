fun main() {
    // The Triangle Inequality Theorem states that the sum of any 2 sides of
    // a triangle must be greater than the measure of the third side
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    if (a + b > c && b + c > a && a + c > b) print("YES") else print("NO")
}