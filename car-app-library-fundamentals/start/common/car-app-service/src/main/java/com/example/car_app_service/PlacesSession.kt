package com.example.car_app_service

import android.content.Intent
import androidx.car.app.Screen
import androidx.car.app.Session
import com.example.car_app_service.screen.NewMainScreen

class PlacesSession: Session() {
    override fun onCreateScreen(intent: Intent): Screen {
        return NewMainScreen(carContext)
    }
}