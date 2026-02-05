package Devices

abstract class SmartDevice(
    val name : String,
    var isOn : Boolean
){
    abstract fun turnOn()
    abstract fun turnOff()
    fun status() {
        println("Устройство: $name | Включено: $isOn")
    }
}