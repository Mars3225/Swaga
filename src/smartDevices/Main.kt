package smartDevices

import smartDevices.Devices.SmartDevice
import smartDevices.Devices.SmartLamp
import smartDevices.Devices.SmartTV
import smartDevices.Devices.SmartAirConditioner
import smartDevices.Devices.RgbLamp

fun main() {

    val lamp = SmartLamp("Super Ultra Bright Lamp")
    val rgbLamp = RgbLamp("Gaming RGB Lamp")

    val devices: List<SmartDevice> = listOf(
        lamp,
        SmartTV("Mega 8k TV"),
        SmartAirConditioner("Holodok", temperature = 18)
    )
    devices.forEach { controlDevice(it) }

    lamp.setBrightness(80)
    lamp.turnOn(70)
    lamp.setBrightness(40)
    lamp.turnOff()
    lamp.setBrightness(20)

    rgbLamp.setColor("Red")
    rgbLamp.setBrightness(60)

    rgbLamp.turnOn(50)

    rgbLamp.setColor("Blue")
    rgbLamp.setBrightness(80)

    rgbLamp.setColor("Green", 30)

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
