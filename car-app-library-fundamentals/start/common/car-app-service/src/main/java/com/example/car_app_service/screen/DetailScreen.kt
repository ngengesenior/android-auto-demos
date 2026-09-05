package com.example.car_app_service.screen

import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.Action
import androidx.car.app.model.CarIcon
import androidx.car.app.model.Header
import androidx.car.app.model.MessageTemplate
import androidx.car.app.model.Pane
import androidx.car.app.model.PaneTemplate
import androidx.car.app.model.Row
import androidx.car.app.model.Template
import androidx.core.graphics.drawable.IconCompat
import com.example.car_app_service.R
import com.example.places.data.PlacesRepository
import com.example.places.data.model.toIntent

class DetailScreen(carContext: CarContext,private val placeId: Int): Screen(carContext) {
    var isBookmarked = false
    override fun onGetTemplate(): Template {
        val place = PlacesRepository()
            .getPlace(placeId) ?: return MessageTemplate.Builder("Place not found")
            .setHeader(
                Header.Builder()
                    .setStartHeaderAction(Action.BACK)
                    .build()
            ).build()

        val navigationAction = Action.Builder()
            .setTitle("Navigate")
            .setIcon(
                CarIcon.Builder(
                    IconCompat.createWithResource(carContext,R.drawable.navigation)
                )
                    .build()
            )
            .setOnClickListener {
                carContext.startCarApp(place.toIntent(CarContext.ACTION_NAVIGATE))
            }
             .build()

        val bookmarkAction = Action.Builder()
            .setIcon(
                CarIcon.Builder(
                    IconCompat.createWithResource(carContext,
                        if (isBookmarked) R.drawable.bookmark_check_24px else R.drawable.bookmark_24px)
                )
                    .build()
            ).setOnClickListener {
                isBookmarked = !isBookmarked
                // Invalidate to refresh
                invalidate()
            }
            .build()


        return PaneTemplate
            .Builder(
                Pane
                    .Builder()
                    .addAction(navigationAction)
                    .addRow(
                        Row.Builder()
                            .setTitle("Coordinates")
                            .addText("${place.latitude},${place.longitude}")
                            .build()
                    )
                    .addRow(
                        Row.Builder()
                            .setTitle("Description")
                            .addText(place.description)
                            .build()
                    ).build()
            )
            .setHeader(
                Header.Builder()
                    .setStartHeaderAction(Action.BACK)
                    .setTitle(place.name)
                    .addEndHeaderAction(bookmarkAction)
                    .build()
            ).build()

    }
}