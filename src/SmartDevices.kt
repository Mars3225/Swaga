fun main() {

    val devices: List<SmartDevice> = listOf(
        SmartLamp("Super Ultra Bright And Smart Lamp"),
        SmartTV("Mega 8k TV"),
        SmartAirConditioner("Holodok", temperature = 18)
    )

//    for (device in devices) {
//        controlDevice(device)
//    }
    devices.forEach { controlDevice(it) }
}


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

fun controlDevice(device: SmartDevice) {
    device.turnOn()
    device.status()
    device.turnOff()
    device.status()
}