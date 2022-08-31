package com.example.anime_guia.model.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object MovieAPIBuilder {

    fun retrofitObjectBulder() : Retrofit = Retrofit.Builder().
    baseUrl("https://api.jikan.moe/v4/").
    addConverterFactory(GsonConverterFactory.create()).build()

    val service = retrofitObjectBulder().create(AnimeAPIService::class.java)
}