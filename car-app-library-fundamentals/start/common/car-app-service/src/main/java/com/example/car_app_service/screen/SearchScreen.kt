package com.example.car_app_service.screen

import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.ItemList
import androidx.car.app.model.Row
import androidx.car.app.model.SearchTemplate
import androidx.car.app.model.Template
import com.example.places.data.SongsRepository

class SearchScreen(carContext: CarContext) : Screen(carContext) {
    private val songsRepo = SongsRepository()
    private var searchQuery: String = ""

    override fun onGetTemplate(): Template {
        val searchCallback = object : SearchTemplate.SearchCallback {
            override fun onSearchSubmitted(searchText: String) {
                searchQuery = searchText
                invalidate()
            }

            override fun onSearchTextChanged(searchText: String) {
                searchQuery = searchText
                invalidate()
            }
        }

        val filteredSongs = songsRepo.searchSongs(searchQuery)

        val itemListBuilder = ItemList.Builder()
            .setNoItemsMessage("No songs found")

        // SearchTemplate supports up to 6 items
        filteredSongs.forEach { song ->
            itemListBuilder.addItem(
                Row.Builder()
                    .setTitle(song.title)
                    .addText("Artist: ${song.artist.name} • ${song.album}")
                    .addText("Duration: ${song.durationSeconds}s")
                    .build()
            )
        }

        return SearchTemplate.Builder(searchCallback)
            .setSearchHint("Search songs...")
            .setShowKeyboardByDefault(true)
            .setInitialSearchText(searchQuery)
            .setItemList(itemListBuilder.build())
            .build()
    }
}
