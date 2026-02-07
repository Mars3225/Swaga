package Devices

class SmartAirConditioner(
    name: String,
    isOn: Boolean = false,
    val temperature : Int
) : SmartDevice (name, isOn) {
    override fun turnOn() {
        when {
            isOn -> {
                println("Уже включено, куда жмякаешь?")
                return
            }
        }
        isOn = true
        println("Ща устроим тут новый ледниковый период. Шучу - температура $temperature")
    }
    override fun turnOff() {
        when {
            !isOn -> {
                println("Уже выключено, куда жмякаешь?")
                return
            }
        }
        isOn = false
        println("Кажись лето закончилось")
    }
}