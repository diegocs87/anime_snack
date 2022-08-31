package com.example.anime_guia.model.network

import com.example.anime_guia.model.AnimeTopDB
import retrofit2.Call
import retrofit2.http.GET

interface AnimeAPIService {

    @GET("top/anime")
    fun getTopAnimeList(): Call<AnimeTopDB>
}