package oop_00000115200_AndyEdlynsonKadiran.week07

class NetworkClient private constructor(val url: String){
    fun connect(){
        println("Connecting to $url...")
    }
}