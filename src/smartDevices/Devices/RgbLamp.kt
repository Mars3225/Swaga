package smartDevices.Devices

class RgbLamp(
    name: String,
    isOn: Boolean = false,
    brightness: Int = 50,
    var color: String = "White"
) : SmartLamp(name, isOn, brightness) {

    override fun setBrightness(value: Int) {
        super.setBrightness(value)   // логика родителя

        if (isOn) {
            println("Текущий цвет: $color")
        }
    }

    fun setColor(newColor: String) {
        if (!isOn) {
            println("Нельзя изменить цвет — лампа выключена")
            return
        }

        color = newColor
        println("Цвет лампы изменён на $color")
    }

    fun setColor(newColor: String, brightness: Int) {
        if (!isOn) {
            println("Нельзя изменить цвет — лампа выключена")
            return
        }

        color = newColor
        println("Цвет лампы изменён на $color")

        setBrightness(brightness)
    }
}
