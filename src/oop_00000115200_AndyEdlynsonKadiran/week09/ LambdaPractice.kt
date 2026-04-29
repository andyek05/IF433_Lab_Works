package oop_00000115200_AndyEdlynsonKadiran.week09

fun main(args: Array<String>) {
    println("=== TEST LAMBDA ===")

    val sumLambda = { a: Int, b: Int -> a + b }
    println("Hasil Sum: ${sumLambda(5,10)}")

    val squareImplicit: (Int) -> Int = { it * it }
    println("Hasil Square: ${squareImplicit(4)}")
}