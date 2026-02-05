package Devices

class SmartAirConditioner(
    name: String,
    isOn: Boolean = false,
    val temperature : Int
) : SmartDevice (name, isOn) {
    override fun turnOn() {
        isOn = true
        println("Ща устроим тут новый ледниковый период. Шучу - температура $temperature")
    }
    override fun turnOff() {
        isOn = false
        println("Кажись лето закончилось")
    }
}