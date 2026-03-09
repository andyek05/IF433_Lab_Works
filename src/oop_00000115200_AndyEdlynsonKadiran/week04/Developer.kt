package oop_00000115200_AndyEdlynsonKadiran.week04

open class Developer(val programmingLanguage: String, name: String, baseSalary: Int): Employee(name, baseSalary) {
    override fun work(){
        println("$name sedang ngoding menggunakan $programmingLanguage")
    }
}