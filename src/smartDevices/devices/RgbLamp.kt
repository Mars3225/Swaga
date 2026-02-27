package smartDevices.devices

class RgbLamp(
    name: String,
    isOn: Boolean = false,
    brightness: Int = 50,
    var color: String = "White"
) : SmartLamp(name, isOn, brightness) {

    override fun setBrightness1(value: Int) {
        super.setBrightness1(value)

        if (isOn) {
            println("Текущий цвет: $color")
        }
    }

    fun setColor1(newColor: String) {
        if (!isOn) {
            println("Нельзя изменить цвет — лампа выключена")
            return
        }

        color = newColor
        println("Цвет лампы изменён на $color")
    }

    fun setColor1(newColor: String, brightness: Int) {
        setColor1(color)
        setBrightness1(brightness)
    }
}
