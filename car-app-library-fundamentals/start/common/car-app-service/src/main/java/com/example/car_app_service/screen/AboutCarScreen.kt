package com.example.car_app_service.screen

import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.hardware.CarHardwareManager
import androidx.car.app.hardware.common.CarValue
import androidx.car.app.hardware.info.Model
import androidx.car.app.model.Header
import androidx.car.app.model.ItemList
import androidx.car.app.model.ListTemplate
import androidx.car.app.model.MessageTemplate
import androidx.car.app.model.ModelUtils
import androidx.car.app.model.Row
import androidx.car.app.model.Template
import androidx.core.content.ContextCompat

class AboutCarScreen(carContext: CarContext): Screen(carContext) {
    private var manufacturer:String = "Loading"
    private var name: String = ""
    private var year:Int? = null
    override fun onGetTemplate(): Template {
        val message = "Vehicle: $manufacturer $name (${year ?:"N/A"})"

        return MessageTemplate
            .Builder(message)
            .setHeader(Header.Builder()
                .setTitle("Car Info")
                .build())
            .build()
    }

    private fun fetchVehicleInfo(){
       val hardwareManager = carContext.getCarService(CarContext.HARDWARE_SERVICE) as CarHardwareManager
        val carInfo = hardwareManager.carInfo

        val executor = ContextCompat.getMainExecutor(carContext)
        carInfo.fetchModel(executor){ model: Model->
            val manufacturerVal = model.manufacturer
            val nameVal = model.name
            val yearVal = model.year

            manufacturer = if (manufacturerVal.status == CarValue.STATUS_SUCCESS){
                manufacturerVal.value?:"Unknown"
            } else {
                "Unavailable"
            }
            name = nameVal.value ?:""
            year = yearVal.value

            invalidate()

        }

    }
}

