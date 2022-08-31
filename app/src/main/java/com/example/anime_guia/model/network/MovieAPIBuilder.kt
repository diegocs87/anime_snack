package com.example.anime_guia.model.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object MovieAPIBuilder {

    fun retrofitObjectBulder() : Retrofit = Retrofit.Builder().
    baseUrl("https://drawsomething-59328-default-rtdb.europe-west1.firebasedatabase.app/").
    addConverterFactory(GsonConverterFactory.create()).build()

    val service = retrofitObjectBulder().create(AnimeAPIService::class.java)
}