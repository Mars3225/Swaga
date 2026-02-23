package smartDevices.Devices

open class SmartLamp(
    name: String,
    isOn: Boolean = false,
    brightness: Int = 50
) : SmartDevice(name, isOn) {

    var brightness: Int = brightness
        private set(value) {
            field = value.coerceIn(0, 100)
        }

    override fun turnOn() {
        if (isOn) {
            println("Уже включено, куда жмякаешь?")
            return
        }
        isOn = true
        println("💡 Лампа включена")
    }

    fun turnOn(brightness: Int) {
        if (!isOn) {
            turnOn() // включаем лампу
        }
        setBrightness(brightness)
    }

    override fun turnOff() {
        if (!isOn) {
            println("Уже выключено, куда жмякаешь?")
            return
        }
        isOn = false
        println("Ну и сиди в темноте...")
    }

    open fun setBrightness(value: Int) {
        if (!isOn) {
            println("⚠️ Нельзя менять яркость — лампа выключена")
            return
        }

        brightness = value
        println("Яркость установлена на $brightness")
    }
}