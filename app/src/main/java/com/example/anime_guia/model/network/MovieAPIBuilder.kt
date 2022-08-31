package com.example.anime_guia.model.network

import retrofit2.Retrofit
import retrofit2.create

object MovieAPIBuilder {

    fun retrofitObjectBulder() : Retrofit = Retrofit.Builder().
    baseUrl("https://api.jikan.moe/v4/").build()

    val service = retrofitObjectBulder().create(AnimeAPIService::class.java)
}