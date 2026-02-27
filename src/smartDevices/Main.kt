package smartDevices

import smartDevices.devices.SmartDevice
import smartDevices.devices.SmartLamp
import smartDevices.devices.SmartTV
import smartDevices.devices.SmartAirConditioner
import smartDevices.devices.RgbLamp

fun main() {

    val lamp = SmartLamp("Super Ultra Bright Lamp")
    val rgbLamp = RgbLamp("Gaming RGB Lamp")

    val devices: List<SmartDevice> = listOf(
        lamp,
        SmartTV("Mega 8k TV"),
        SmartAirConditioner("Holodok", temperature = 18)
    )
    devices.forEach { controlDevice(it) }

    lamp.setBrightness1(80)
    lamp.turnOn(70)
    lamp.setBrightness1(40)
    lamp.turnOff()
    lamp.setBrightness1(20)

    rgbLamp.setColor1("Red")
    rgbLamp.setBrightness1(60)

    rgbLamp.turnOn(50)

    rgbLamp.setColor1("Blue")
    rgbLamp.setBrightness1(80)

    rgbLamp.setColor1("Green", 30)

    rgbLamp.turnOff()
}

fun controlDevice(device: SmartDevice) {
    device.turnOn()
    device.status()
    device.turnOff()
    device.status()
}

fun changeTemperature(device: SmartAirConditioner): SmartAirConditioner {
    print("Введите новое значение температуры: ")
    val input = readln()
    val inputToInt = input.toIntOrNull() ?: 22
    device.temperature = inputToInt
    println("Установлена температура: ${device.temperature}")
    return device
}
