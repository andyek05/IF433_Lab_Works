package oop_00000115200_AndyEdlynsonKadiran.week13

import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String, // "Long" atau "Short"
    val margin: Double,
    val pnl: Double
)

fun TradeRecord.toCsv(): String = "$id,$symbol,$type,$margin,$pnl"