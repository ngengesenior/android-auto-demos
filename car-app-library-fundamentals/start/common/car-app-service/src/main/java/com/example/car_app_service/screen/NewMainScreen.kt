package com.example.car_app_service.screen

import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.Header
import androidx.car.app.model.ItemList
import androidx.car.app.model.ListTemplate
import androidx.car.app.model.Row
import androidx.car.app.model.Template
import com.example.car_app_service.screen.model.AppScreen

class NewMainScreen(carContext: CarContext): Screen(carContext) {
    val screens = AppScreen.entries
    override fun onGetTemplate(): Template {
        val itemListBuilder = ItemList
            .Builder()
            .setNoItemsMessage("No screens here")

        screens.forEach { sc->
            itemListBuilder.addItem(
                Row.Builder()
                    .setTitle(sc.screenName)
                    .setOnClickListener {
                        navigateToScreen(sc)
                    }
                    .build()
            )
        }

        return ListTemplate.Builder()
            .setSingleList(itemListBuilder.build())
            .setHeader(
                Header.Builder()
                    .setTitle("Screens")
                    .build()
            )
            .build()

    }

    private fun navigateToScreen(appScreen: AppScreen){
        when(appScreen){
            AppScreen.Search -> screenManager.push(SearchScreen(carContext))
            AppScreen.SignIn -> screenManager.push(SignInScreen(carContext))
            AppScreen.Details -> screenManager.push(DetailScreen(carContext,1))
            AppScreen.Grid -> screenManager.push(GridScreen(carContext))
            AppScreen.About -> screenManager.push(AboutCarScreen(carContext))
        }

    }
}