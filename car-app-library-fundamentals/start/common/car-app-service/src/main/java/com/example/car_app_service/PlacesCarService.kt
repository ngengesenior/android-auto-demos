package com.example.car_app_service

import androidx.car.app.CarAppService
import androidx.car.app.Session
import androidx.car.app.SessionInfo
import androidx.car.app.validation.HostValidator

class PlacesCarService: CarAppService() {
    override fun createHostValidator(): HostValidator {
        return HostValidator.ALLOW_ALL_HOSTS_VALIDATOR
    }


    override fun onCreateSession(sessionInfo: SessionInfo): Session {
        return PlacesSession()
    }


}