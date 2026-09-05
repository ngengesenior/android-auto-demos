package com.example.car_app_service.screen

import android.text.Spannable
import android.text.SpannableString
import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.Action
import androidx.car.app.model.CarLocation
import androidx.car.app.model.Distance
import androidx.car.app.model.DistanceSpan
import androidx.car.app.model.Header
import androidx.car.app.model.ItemList
import androidx.car.app.model.Metadata
import androidx.car.app.model.Pane
import androidx.car.app.model.PaneTemplate
import androidx.car.app.model.Place
import androidx.car.app.model.PlaceListMapTemplate
import androidx.car.app.model.PlaceMarker
import androidx.car.app.model.Row
import androidx.car.app.model.Template
import com.example.places.data.PlacesRepository

class MainScreen(carContext: CarContext): Screen(carContext) {
    override fun onGetTemplate(): Template {
        val placesRepository = PlacesRepository()
        val itemListBuilder = ItemList
            .Builder()
            .setNoItemsMessage("No places to show")
        placesRepository
            .getPlaces()
            .forEach {
                itemListBuilder.addItem(
                    Row.Builder()
                        .setTitle(it.name)
                    // Each item must have a DistanceSpan applied to either the title or one of its line text to help
                    //drivers make decisions
                        .addText(SpannableString(" ").apply {
                            setSpan(
                                DistanceSpan.create(
                                    Distance.create(Math.random() * 100, Distance.UNIT_KILOMETERS)
                                ),0,1, Spannable.SPAN_INCLUSIVE_INCLUSIVE
                            )
                        }
                        )
                        .setOnClickListener {
                            //screenManager.push(DetailScreen(carContext,it.id))
                            screenManager.push(GridScreen(carContext))
                        }
                        // Meta data optional but required to automatically show the item's location on the provided map
                        .setMetadata(
                            Metadata.Builder()
                                .setPlace(Place.Builder(CarLocation.create(it.latitude,it.longitude))
                                    .setMarker(PlaceMarker.Builder().build())
                                    .build())
                                .build()

                        ).build()

                )
            }


        return PlaceListMapTemplate
            .Builder()
            .setTitle("Places")
            .setItemList(itemListBuilder.build())
            .build()
    }

}