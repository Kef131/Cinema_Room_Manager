import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    var balanceMoney = scanner.nextInt()
    var nextPurchase = 0
    var currentTransaction = 0
    while (balanceMoney >= 0 && scanner.hasNext()) {
        nextPurchase = scanner.nextInt()
        currentTransaction = balanceMoney - nextPurchase
        if (currentTransaction < 0) {
            print("Error, insufficient funds for the purchase. You have $balanceMoney, but you need $nextPurchase.")
            break
        } else {
            balanceMoney -= nextPurchase
        }
    }
    if (currentTransaction >= 0) {
        print("Thank you for choosing us to manage your account! You have $balanceMoney money.")
    }
    /*
    5000
    5000 1
     */
}
