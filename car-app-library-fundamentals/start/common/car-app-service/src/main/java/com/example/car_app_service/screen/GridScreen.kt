package com.example.car_app_service.screen

import android.media.Image
import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.Action
import androidx.car.app.model.CarIcon
import androidx.car.app.model.GridItem
import androidx.car.app.model.GridTemplate
import androidx.car.app.model.Header
import androidx.car.app.model.ItemList
import androidx.car.app.model.Template
import androidx.core.graphics.drawable.IconCompat
import com.example.car_app_service.R
import com.example.places.data.SongsRepository
import com.example.places.data.model.Song

class GridScreen(carContext: CarContext): Screen(carContext) {
    val songsRepo = SongsRepository()
    val itemListBuilder = ItemList
        .Builder()
        .setNoItemsMessage("No songs here")

    override fun onGetTemplate(): Template {
        songsRepo
            .getSongs()
            .forEach {
                itemListBuilder.addItem(
                    GridItem.Builder()
                        .setTitle(it.title)
                        .setText(it.artist.name)
                        .setImage(CarIcon
                            .Builder(IconCompat.createWithResource(carContext,R.drawable.navigation))
                            .build()
                        )
                        .build()
                )
            }
        return GridTemplate
            .Builder()
            .setHeader(Header.Builder()
                .setTitle("Songs")
                .addEndHeaderAction(Action.BACK)
                .build())
            .setSingleList(itemListBuilder.build())
            .build()
    }
}