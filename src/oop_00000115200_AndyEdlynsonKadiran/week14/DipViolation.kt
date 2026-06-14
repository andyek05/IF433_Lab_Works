package oop_00000115200_AndyEdlynsonKadiran.week14

class MySQLDatabase {
    fun query(sql: String): List<String> = listOf("data1", "data2")
}

class UserService {
    private val database = MySQLDatabase()

    fun getUser(id: Int): List<String> {
        return database.query("SELECT * FROM users WHERE id=$id")
    }
}