package oop_00000115200_AndyEdlynsonKadiran.week08

class NotificationService{
    fun sendEmail(emailAddress: String){
        println("Mengirim email ke: $emailAddress")
    }

    fun processUser(user: UserProfile){
        if(user.email != null){
            sendEmail(user.email)
        } else {
            println("User ${user.name} tidak memiliki email.")
        }
    }
}