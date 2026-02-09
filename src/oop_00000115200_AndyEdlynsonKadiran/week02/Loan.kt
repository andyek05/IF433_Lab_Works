package oop_00000115200_AndyEdlynsonKadiran.week02

class Loan(
    val bookTitle: String,
    val borrower: String,
    var loanDuration: Int = 1
){
    fun calculateFine(): Int {
        var denda = 0
        var overdue = 0

        if(loanDuration > 3){
            overdue = loanDuration - 3
            denda = overdue * 2000
        } else {
            denda = 0
        }

        return denda
    }
}