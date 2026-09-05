package com.example.car_app_service.screen

import androidx.car.app.CarContext
import androidx.car.app.CarToast
import androidx.car.app.Screen
import androidx.car.app.hardware.CarHardwareManager
import androidx.car.app.hardware.common.CarValue
import androidx.car.app.hardware.info.Model
import androidx.car.app.model.Action
import androidx.car.app.model.Header
import androidx.car.app.model.MessageTemplate
import androidx.car.app.model.Template
import androidx.core.content.ContextCompat

class AboutCarScreen(carContext: CarContext): Screen(carContext) {
    private var manufacturer: String = "Loading"
    private var name: String = ""
    private var year: Int? = null

    override fun onGetTemplate(): Template {
        val message = if ((manufacturer == "Unavailable") && name.isEmpty() && (year == null)) {
            "Vehicle information unavailable"
        } else {
            "Vehicle: $manufacturer $name (${year ?: "N/A"})".trim()
        }

        return MessageTemplate
            .Builder(message)
            .setHeader(
                Header.Builder()
                    .setTitle("Car Info")
                    .setStartHeaderAction(Action.BACK)
                    .build(),
            )
            .build()
    }

    init {
        fetchVehicleInfo()
    }

    private fun fetchVehicleInfo() {
        CarToast.makeText(carContext, "Fetching vehicle info...", CarToast.LENGTH_SHORT).show()
        try {
            val hardwareManager = carContext.getCarService(CarContext.HARDWARE_SERVICE) as? CarHardwareManager
            val carInfo = hardwareManager?.carInfo

            if (carInfo == null) {
                CarToast.makeText(carContext, "CarHardwareManager/CarInfo is null", CarToast.LENGTH_LONG).show()
                manufacturer = "Unavailable"
                invalidate()
                return
            }

            val executor = ContextCompat.getMainExecutor(carContext)
            carInfo.fetchModel(executor) { model: Model ->
                try {
                    val manufacturerVal = model.manufacturer
                    val nameVal = model.name
                    val yearVal = model.year

                    if (manufacturerVal.status == CarValue.STATUS_SUCCESS) {
                        manufacturer = manufacturerVal.value ?: "Unknown"
                        CarToast.makeText(
                            carContext,
                            "Vehicle info fetched: $manufacturer ${nameVal.value ?: ""}",
                            CarToast.LENGTH_SHORT,
                        ).show()
                    } else {
                        manufacturer = "Unavailable"
                        CarToast.makeText(
                            carContext,
                            "Vehicle info status: ${manufacturerVal.status} (Unavailable)",
                            CarToast.LENGTH_LONG,
                        ).show()
                    }
                    name = nameVal.value ?: ""
                    year = yearVal.value

                    invalidate()
                } catch (e: Throwable) {
                    CarToast.makeText(
                        carContext,
                        "Error in vehicle info callback: ${e.message ?: "Unknown error"}",
                        CarToast.LENGTH_LONG,
                    ).show()
                    manufacturer = "Unavailable"
                    invalidate()
                }
            }
        } catch (e: Throwable) {
            CarToast.makeText(
                carContext,
                "Hardware service error: ${e.message ?: "Service unavailable"}",
                CarToast.LENGTH_LONG,
            ).show()
            manufacturer = "Unavailable"
            invalidate()
        }
    }
}

