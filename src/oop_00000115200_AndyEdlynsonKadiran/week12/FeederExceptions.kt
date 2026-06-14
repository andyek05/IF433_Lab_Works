package oop_00000115200_AndyEdlynsonKadiran.week12

sealed class FeederException(msg: String) : Exception(msg) {

    class ConnectionTimeout(message: String) : FeederException(message)

    class InvalidData(message: String) : FeederException(message)

    class EmptyResource(message: String) : FeederException(message)

    class UnknownFeederError(message: String, cause: Throwable? = null) : FeederException(message)
}

class FoodEmptyException(requested: Int, available: Int) :
    FeederException("Kibble tidak cukup! Diminta $requested gr, sisa $available gr")

class DispenserJamException :
    FeederException("Wadah dispenser tersangkut/macet!")