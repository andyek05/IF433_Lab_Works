package oop_00000115200_AndyEdlynsonKadiran.week05

fun main() {
    val math = MathHelper()

    val luasPersegi = math.hitungLuas(5)
    println("Area of Shape with 5 sides: $luasPersegi")

    val luasPersegiPanjang = math.hitungLuas(10, 5)
    println("Ares of Rectangle (10x5): $luasPersegiPanjang")

    val luasLingkaran = math.hitungLuas(7.0)
    println("Area of Circle (radius 7.0): $luasLingkaran")
}