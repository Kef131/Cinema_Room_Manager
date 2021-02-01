package cinema

import java.math.RoundingMode
import java.text.DecimalFormat

var rows = 0
var seatsPerRow = 0
var totalSeats = 0
var cinemaSeatsArray: Array<CharArray> = emptyArray()
var purchasedTickets = 0
var currentIncome = 0
var totalIncome = 0

fun showStatistics() {
    val decimalFormat= DecimalFormat("#.##")
    decimalFormat.roundingMode = RoundingMode.CEILING
    println("\nNumber of purchased tickets: $purchasedTickets")
    println("Percentage: ${String.format("%.2f",(purchasedTickets.toDouble() / totalSeats) * 100)}%")
    println("Current income: $$currentIncome")
    println("Total income: $$totalIncome")
}

fun showMenu() {
    println("\n1. Show the seats\n" +
            "2. Buy a ticket\n" +
            "3. Statistics\n" +
            "0. Exit")
}

fun showCinemaSeats() {
    print("\nCinema:\n  ")
    for (i in 1..seatsPerRow) print("$i ")
    println()
    for (i in cinemaSeatsArray.indices) {
        println("${i + 1} ${cinemaSeatsArray[i].joinToString(" ")}")
    }
}

fun buyTicket() {
    var rowNumber : Int
    var seatNumber : Int
    do {
        println("\nEnter a row number:")
        rowNumber = readLine()!!.toInt()
        println("Enter a seat number in that row:")
        seatNumber = readLine()!!.toInt()
        if (rowNumber > rows || seatNumber > seatsPerRow) {
            println("\nWrong input!")
        }
        else if (cinemaSeatsArray[rowNumber - 1][seatNumber - 1] == 'B') {
            println("\nThat ticket has already been purchased!")
        }
    } while (rowNumber > rows || seatNumber > seatsPerRow || cinemaSeatsArray[rowNumber - 1][seatNumber - 1] == 'B')

    cinemaSeatsArray[rowNumber - 1][seatNumber - 1] = 'B'
    purchasedTickets++

    if (totalSeats <= 60) {
        println("\nTicket price: $10")
        currentIncome += 10
    } else {
        if (rows % 2 == 0) {
            if (rowNumber <= rows / 2) {
                println("\nTicket price: $10")
                currentIncome += 10
            } else {
                println("\nTicket price: $8")
                currentIncome += 8
            }
        } else {
            val rowsFirstHalf = rows.toDouble() / 2
            if (rowNumber <= rowsFirstHalf) {
                println("\nTicket price: $10")
                currentIncome += 10
            } else {
                println("\nTicket price: $8")
                currentIncome += 8
            }
        }
    }
}

fun totalIncome() {
    if (totalSeats <= 60) {
        totalIncome = totalSeats * 10
    } else {
        if (rows % 2 == 0) {
            val halfSeats = totalSeats / 2
            totalIncome = halfSeats * 10 + halfSeats * 8
        } else {
            val rowsFirstHalf = Math.floor(rows.toDouble() / 2)
            val firstHalfSeats = rowsFirstHalf * seatsPerRow
            val secondHalfSeats = (rows - rowsFirstHalf) * seatsPerRow
            totalIncome = ((firstHalfSeats * 10) + (secondHalfSeats * 8)).toInt()
        }
    }
}


fun main() {
    println("Enter the number of rows: ")
    rows = readLine()!!.toInt()
    println("Enter the number of seats in each row: ")
    seatsPerRow = readLine()!!.toInt()
    cinemaSeatsArray = Array(rows) { CharArray(seatsPerRow) {'S'} }
    totalSeats = rows * seatsPerRow
    totalIncome()
    var optionMenu : Int
    do {
        showMenu()
        optionMenu = readLine()!!.toInt()
        when (optionMenu) {
            1 -> showCinemaSeats()
            2 -> buyTicket()
            3 -> showStatistics()
        }
    } while (optionMenu != 0)
}
