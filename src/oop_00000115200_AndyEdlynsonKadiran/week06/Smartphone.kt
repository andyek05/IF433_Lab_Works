package oop_00000115200_AndyEdlynsonKadiran.week06

class Smartphone : Camera, Phone {
    override fun turnOn(){
        super<Camera>.turnOn()
        super<Phone>.turnOn()
        println("Sistem operasi Smartphone berhasil booting.")
    }
}