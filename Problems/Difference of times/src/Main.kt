import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val hour1 = scanner.nextInt()
    val minute1 = scanner.nextInt()
    val second1 = scanner.nextInt()
    val hour2 = scanner.nextInt()
    val minute2 = scanner.nextInt()
    val second2 = scanner.nextInt()
    val totalHoursinSec = (hour2 - hour1) * 3600
    val totalMinutesinSec = (minute2 - minute1) * 60
    val totalSeconds = second2 - second1
    println(totalHoursinSec + totalMinutesinSec + totalSeconds)
}
