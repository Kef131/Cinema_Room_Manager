fun main(){
    val numbers = IntArray(100)
    repeat(100) {
        if (it == 0) {
            numbers[it] = 1
        } else if (it == 9) {
            numbers[it] = 10
        } else if (it == 99) {
            numbers[it] = 100
        } else {
            numbers[it] = 0
        }
    }
}
