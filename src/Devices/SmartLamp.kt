package Devices

class SmartLamp(
    name: String,
    isOn: Boolean = false
) : SmartDevice (name, isOn) {
    override fun turnOn() {
        isOn = true
        println("Флешка!")
    }
    override fun turnOff() {
        isOn = false
        println("Ну и сиди в темноте...")
    }
}