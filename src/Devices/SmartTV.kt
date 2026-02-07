package Devices

class SmartTV(
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
        println("Новогоднее поздравление президента?")
    }
    override fun turnOff() {
        when {
            !isOn -> {
                println("Уже выключено, куда жмякаешь?")
                return
            }
        }
        isOn = false
        println("Увидимся через год...")
    }
}