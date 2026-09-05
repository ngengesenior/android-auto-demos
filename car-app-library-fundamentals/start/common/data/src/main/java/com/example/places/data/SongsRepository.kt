/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.places.data

import com.example.places.data.model.Artist
import com.example.places.data.model.Song

val ARTISTS = listOf(
    Artist(1, "Queen", "Rock", "https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4"),
    Artist(2, "Miles Davis", "Jazz", "https://images.unsplash.com/photo-1511192336575-5a79af67a629"),
    Artist(3, "Daft Punk", "Electronic", "https://images.unsplash.com/photo-1470225620780-dba8ba36b745"),
    Artist(4, "Adele", "Soul", "https://images.unsplash.com/photo-1516450360452-9312f5e86fc7"),
    Artist(5, "Kendrick Lamar", "Hip Hop", "https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f"),
    Artist(6, "Taylor Swift", "Pop", "https://images.unsplash.com/photo-1514525253161-7a46d19cd819"),
    Artist(7, "Stevie Wonder", "R&B", "https://images.unsplash.com/photo-1465847899084-d164df4dedc6"),
    Artist(8, "Fleetwood Mac", "Rock", "https://images.unsplash.com/photo-1501386761578-eac5c94b800a"),
    Artist(9, "Michael Jackson", "Pop", "https://images.unsplash.com/photo-1508700115892-45ecd05ae2ad"),
    Artist(10, "Nina Simone", "Jazz", "https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4"),
    Artist(11, "Coldplay", "Indie", "https://images.unsplash.com/photo-1442504028989-ab58b5f29a4a"),
    Artist(12, "The Beatles", "Rock", "https://images.unsplash.com/photo-1483412033650-1015ddeb83d1"),
    Artist(13, "Beyoncé", "R&B", "https://images.unsplash.com/photo-1501386761578-eac5c94b800a"),
    Artist(14, "John Coltrane", "Jazz", "https://images.unsplash.com/photo-1511192336575-5a79af67a629"),
    Artist(15, "Pink Floyd", "Rock", "https://images.unsplash.com/photo-1470225620780-dba8ba36b745"),
    Artist(16, "Frank Sinatra", "Jazz", "https://images.unsplash.com/photo-1514525253161-7a46d19cd819"),
    Artist(17, "Billie Eilish", "Pop", "https://images.unsplash.com/photo-1516450360452-9312f5e86fc7"),
    Artist(18, "Marvin Gaye", "Soul", "https://images.unsplash.com/photo-1465847899084-d164df4dedc6"),
    Artist(19, "Bob Marley", "Reggae", "https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f"),
    Artist(20, "Ludwig van Beethoven", "Classical", "https://images.unsplash.com/photo-1508700115892-45ecd05ae2ad")
)

val SONGS = listOf(
    // Queen
    Song(1, "Bohemian Rhapsody", ARTISTS[0], "A Night at the Opera", 354, "https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4"),
    Song(2, "Don't Stop Me Now", ARTISTS[0], "Jazz", 209, "https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4"),
    Song(3, "Another One Bites the Dust", ARTISTS[0], "The Game", 215, "https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4"),
    Song(4, "Under Pressure", ARTISTS[0], "Hot Space", 248, "https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4"),
    Song(5, "Radio Ga Ga", ARTISTS[0], "The Works", 348, "https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4"),

    // Miles Davis
    Song(6, "So What", ARTISTS[1], "Kind of Blue", 562, "https://images.unsplash.com/photo-1511192336575-5a79af67a629"),
    Song(7, "Freddie Freeloader", ARTISTS[1], "Kind of Blue", 589, "https://images.unsplash.com/photo-1511192336575-5a79af67a629"),
    Song(8, "Blue in Green", ARTISTS[1], "Kind of Blue", 337, "https://images.unsplash.com/photo-1511192336575-5a79af67a629"),
    Song(9, "All Blues", ARTISTS[1], "Kind of Blue", 693, "https://images.unsplash.com/photo-1511192336575-5a79af67a629"),
    Song(10, "Flamenco Sketches", ARTISTS[1], "Kind of Blue", 566, "https://images.unsplash.com/photo-1511192336575-5a79af67a629"),

    // Daft Punk
    Song(11, "Get Lucky", ARTISTS[2], "Random Access Memories", 248, "https://images.unsplash.com/photo-1470225620780-dba8ba36b745"),
    Song(12, "One More Time", ARTISTS[2], "Discovery", 320, "https://images.unsplash.com/photo-1470225620780-dba8ba36b745"),
    Song(13, "Harder, Better, Faster, Stronger", ARTISTS[2], "Discovery", 224, "https://images.unsplash.com/photo-1470225620780-dba8ba36b745"),
    Song(14, "Around the World", ARTISTS[2], "Homework", 429, "https://images.unsplash.com/photo-1470225620780-dba8ba36b745"),
    Song(15, "Instant Crush", ARTISTS[2], "Random Access Memories", 337, "https://images.unsplash.com/photo-1470225620780-dba8ba36b745"),

    // Adele
    Song(16, "Rolling in the Deep", ARTISTS[3], "21", 228, "https://images.unsplash.com/photo-1516450360452-9312f5e86fc7"),
    Song(17, "Someone Like You", ARTISTS[3], "21", 285, "https://images.unsplash.com/photo-1516450360452-9312f5e86fc7"),
    Song(18, "Hello", ARTISTS[3], "25", 295, "https://images.unsplash.com/photo-1516450360452-9312f5e86fc7"),
    Song(19, "Set Fire to the Rain", ARTISTS[3], "21", 242, "https://images.unsplash.com/photo-1516450360452-9312f5e86fc7"),
    Song(20, "Easy On Me", ARTISTS[3], "30", 224, "https://images.unsplash.com/photo-1516450360452-9312f5e86fc7"),

    // Kendrick Lamar
    Song(21, "HUMBLE.", ARTISTS[4], "DAMN.", 177, "https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f"),
    Song(22, "DNA.", ARTISTS[4], "DAMN.", 185, "https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f"),
    Song(23, "Alright", ARTISTS[4], "To Pimp a Butterfly", 219, "https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f"),
    Song(24, "Swimming Pools (Drank)", ARTISTS[4], "good kid, m.A.A.d city", 313, "https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f"),
    Song(25, "Money Trees", ARTISTS[4], "good kid, m.A.A.d city", 386, "https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f"),

    // Taylor Swift
    Song(26, "Blank Space", ARTISTS[5], "1989", 231, "https://images.unsplash.com/photo-1514525253161-7a46d19cd819"),
    Song(27, "Shake It Off", ARTISTS[5], "1989", 219, "https://images.unsplash.com/photo-1514525253161-7a46d19cd819"),
    Song(28, "Anti-Hero", ARTISTS[5], "Midnights", 200, "https://images.unsplash.com/photo-1514525253161-7a46d19cd819"),
    Song(29, "Love Story", ARTISTS[5], "Fearless", 235, "https://images.unsplash.com/photo-1514525253161-7a46d19cd819"),
    Song(30, "Cruel Summer", ARTISTS[5], "Lover", 178, "https://images.unsplash.com/photo-1514525253161-7a46d19cd819"),

    // Stevie Wonder
    Song(31, "Superstition", ARTISTS[6], "Talking Book", 266, "https://images.unsplash.com/photo-1465847899084-d164df4dedc6"),
    Song(32, "Sir Duke", ARTISTS[6], "Songs in the Key of Life", 232, "https://images.unsplash.com/photo-1465847899084-d164df4dedc6"),
    Song(33, "I Wish", ARTISTS[6], "Songs in the Key of Life", 252, "https://images.unsplash.com/photo-1465847899084-d164df4dedc6"),
    Song(34, "Isn't She Lovely", ARTISTS[6], "Songs in the Key of Life", 394, "https://images.unsplash.com/photo-1465847899084-d164df4dedc6"),
    Song(35, "Signed, Sealed, Delivered I'm Yours", ARTISTS[6], "Signed, Sealed & Delivered", 166, "https://images.unsplash.com/photo-1465847899084-d164df4dedc6"),

    // Fleetwood Mac
    Song(36, "Dreams", ARTISTS[7], "Rumours", 257, "https://images.unsplash.com/photo-1501386761578-eac5c94b800a"),
    Song(37, "Go Your Own Way", ARTISTS[7], "Rumours", 223, "https://images.unsplash.com/photo-1501386761578-eac5c94b800a"),
    Song(38, "The Chain", ARTISTS[7], "Rumours", 270, "https://images.unsplash.com/photo-1501386761578-eac5c94b800a"),
    Song(39, "Don't Stop", ARTISTS[7], "Rumours", 193, "https://images.unsplash.com/photo-1501386761578-eac5c94b800a"),
    Song(40, "Landslide", ARTISTS[7], "Fleetwood Mac", 199, "https://images.unsplash.com/photo-1501386761578-eac5c94b800a"),

    // Michael Jackson
    Song(41, "Billie Jean", ARTISTS[8], "Thriller", 294, "https://images.unsplash.com/photo-1508700115892-45ecd05ae2ad"),
    Song(42, "Beat It", ARTISTS[8], "Thriller", 258, "https://images.unsplash.com/photo-1508700115892-45ecd05ae2ad"),
    Song(43, "Smooth Criminal", ARTISTS[8], "Bad", 257, "https://images.unsplash.com/photo-1508700115892-45ecd05ae2ad"),
    Song(44, "Man in the Mirror", ARTISTS[8], "Bad", 319, "https://images.unsplash.com/photo-1508700115892-45ecd05ae2ad"),
    Song(45, "Thriller", ARTISTS[8], "Thriller", 357, "https://images.unsplash.com/photo-1508700115892-45ecd05ae2ad"),

    // Nina Simone
    Song(46, "Feeling Good", ARTISTS[9], "I Put a Spell on You", 173, "https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4"),
    Song(47, "I Put a Spell on You", ARTISTS[9], "I Put a Spell on You", 154, "https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4"),
    Song(48, "Strange Fruit", ARTISTS[9], "Pastel Blues", 213, "https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4"),
    Song(49, "Sinner Man", ARTISTS[9], "Pastel Blues", 622, "https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4"),

    // Coldplay
    Song(50, "Yellow", ARTISTS[10], "Parachutes", 269, "https://images.unsplash.com/photo-1442504028989-ab58b5f29a4a"),
    Song(51, "Fix You", ARTISTS[10], "X&Y", 295, "https://images.unsplash.com/photo-1442504028989-ab58b5f29a4a"),
    Song(52, "Viva La Vida", ARTISTS[10], "Viva la Vida", 242, "https://images.unsplash.com/photo-1442504028989-ab58b5f29a4a"),
    Song(53, "The Scientist", ARTISTS[10], "A Rush of Blood to the Head", 309, "https://images.unsplash.com/photo-1442504028989-ab58b5f29a4a"),
    Song(54, "Clocks", ARTISTS[10], "A Rush of Blood to the Head", 307, "https://images.unsplash.com/photo-1442504028989-ab58b5f29a4a"),

    // The Beatles
    Song(55, "Hey Jude", ARTISTS[11], "Hey Jude", 431, "https://images.unsplash.com/photo-1483412033650-1015ddeb83d1"),
    Song(56, "Let It Be", ARTISTS[11], "Let It Be", 243, "https://images.unsplash.com/photo-1483412033650-1015ddeb83d1"),
    Song(57, "Come Together", ARTISTS[11], "Abbey Road", 259, "https://images.unsplash.com/photo-1483412033650-1015ddeb83d1"),
    Song(58, "Here Comes the Sun", ARTISTS[11], "Abbey Road", 185, "https://images.unsplash.com/photo-1483412033650-1015ddeb83d1"),
    Song(59, "Yesterday", ARTISTS[11], "Help!", 125, "https://images.unsplash.com/photo-1483412033650-1015ddeb83d1"),

    // Beyoncé
    Song(60, "Crazy in Love", ARTISTS[12], "Dangerously in Love", 236, "https://images.unsplash.com/photo-1501386761578-eac5c94b800a"),
    Song(61, "Halo", ARTISTS[12], "I Am... Sasha Fierce", 261, "https://images.unsplash.com/photo-1501386761578-eac5c94b800a"),
    Song(62, "Single Ladies", ARTISTS[12], "I Am... Sasha Fierce", 193, "https://images.unsplash.com/photo-1501386761578-eac5c94b800a"),
    Song(63, "CUFF IT", ARTISTS[12], "RENAISSANCE", 225, "https://images.unsplash.com/photo-1501386761578-eac5c94b800a"),

    // John Coltrane
    Song(64, "Giant Steps", ARTISTS[13], "Giant Steps", 283, "https://images.unsplash.com/photo-1511192336575-5a79af67a629"),
    Song(65, "My Favorite Things", ARTISTS[13], "My Favorite Things", 824, "https://images.unsplash.com/photo-1511192336575-5a79af67a629"),

    // Pink Floyd
    Song(66, "Comfortably Numb", ARTISTS[14], "The Wall", 382, "https://images.unsplash.com/photo-1470225620780-dba8ba36b745"),
    Song(67, "Wish You Were Here", ARTISTS[14], "Wish You Were Here", 334, "https://images.unsplash.com/photo-1470225620780-dba8ba36b745"),

    // Frank Sinatra
    Song(68, "Fly Me to the Moon", ARTISTS[15], "It Might as Well Be Swing", 147, "https://images.unsplash.com/photo-1514525253161-7a46d19cd819"),

    // Billie Eilish
    Song(69, "bad guy", ARTISTS[16], "WHEN WE ALL FALL ASLEEP, WHERE DO WE GO?", 194, "https://images.unsplash.com/photo-1516450360452-9312f5e86fc7"),

    // Marvin Gaye
    Song(70, "What's Going On", ARTISTS[17], "What's Going On", 233, "https://images.unsplash.com/photo-1465847899084-d164df4dedc6"),

    // Bob Marley
    Song(71, "Three Little Birds", ARTISTS[18], "Exodus", 180, "https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f"),

    // Ludwig van Beethoven
    Song(72, "Symphony No. 5 in C Minor", ARTISTS[19], "Beethoven: Essential Symphonies", 420, "https://images.unsplash.com/photo-1508700115892-45ecd05ae2ad")
)

class SongsRepository {

    fun getSongs(): List<Song> {
        return SONGS
    }

    fun getSong(songId: Int): Song? {
        return SONGS.find { it.id == songId }
    }

    fun searchSongs(query: String): List<Song> {
        if (query.isBlank()) return SONGS
        val lowercaseQuery = query.lowercase().trim()
        return SONGS.filter { song ->
            song.title.lowercase().contains(lowercaseQuery) ||
                    song.artist.name.lowercase().contains(lowercaseQuery) ||
                    song.album.lowercase().contains(lowercaseQuery) ||
                    song.artist.genre.lowercase().contains(lowercaseQuery)
        }
    }

    fun getSongsByArtist(artistId: Int): List<Song> {
        return SONGS.filter { it.artist.id == artistId }
    }

    fun getSongsByGenre(genre: String): List<Song> {
        return SONGS.filter { it.artist.genre.equals(genre, ignoreCase = true) }
    }

    fun getArtists(): List<Artist> {
        return ARTISTS
    }

    fun getArtist(artistId: Int): Artist? {
        return ARTISTS.find { it.id == artistId }
    }

    fun getGenres(): List<String> {
        return ARTISTS.map { it.genre }.distinct().sorted()
    }
}
