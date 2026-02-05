package Devices

class SmartTV(
    name: String,
    isOn: Boolean = false
) : SmartDevice (name, isOn) {
    override fun turnOn() {
        isOn = true
        println("Новогоднее поздравление президента?")
    }
    override fun turnOff() {
        isOn = false
        println("Увидимся через год...")
    }
}