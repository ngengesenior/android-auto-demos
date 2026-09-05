package com.example.places.data.model

data class Artist(
    val id: Int,
    val name: String,
    val genre: String = "",
    val imageUrl: String? = null
)

data class Song(
    val id: Int,
    val title: String,
    val artist: Artist,
    val album: String = "",
    val durationSeconds: Int = 0,
    val coverArtUrl: String? = null,
    val mediaUri: String? = null
)
