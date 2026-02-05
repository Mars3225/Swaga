import Devices.SmartDevice
import Devices.SmartLamp
import Devices.SmartTV
import Devices.SmartAirConditioner

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

fun controlDevice(device: SmartDevice) {
    device.turnOn()
    device.status()
    device.turnOff()
    device.status()
}