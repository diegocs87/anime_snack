package com.example.anime_guia.model

import com.google.gson.annotations.SerializedName

data class Anime (
    @SerializedName("tittle")
    val  tittle: String,
    @SerializedName("episodes")
    val episodes: String,
    @SerializedName("studios")
    val studios: String,
    @SerializedName("image")
    val cover: String,
    @SerializedName("rank")
    val rank:String,
    @SerializedName("score")
    val score: String,
    @SerializedName("status")
    val status: String,
    @SerializedName("synopsis")
    val synopsis: String,
    @SerializedName("trailer")
    val trailer: String,
    @SerializedName("genres")
    val genres: String
)