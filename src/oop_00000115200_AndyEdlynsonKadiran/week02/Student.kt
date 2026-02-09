package oop_00000115200_AndyEdlynsonKadiran.week02

class Student (
    val name: String,
    val nim: String,
    var major: String
){
    init {
        if (nim.length != 5){
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: Objek student $name berhasil dialokasikan di Memory.")
        }
    }
}