package Devices

class SmartLamp(
    name: String,
    isOn: Boolean = false
) : SmartDevice (name, isOn) {
    override fun turnOn() {
        when {
            isOn -> {
                println("Уже включено, куда жмякаешь?")
                return
            }
        }
        isOn = true
        println("Флешка!")
    }
    override fun turnOff() {
        when {
            !isOn -> {
                println("Уже выключено, куда жмякаешь?")
                return
            }
        }
        isOn = false
        println("Ну и сиди в темноте...")
    }
}