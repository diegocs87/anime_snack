package com.example.anime_guia.model.network

import com.example.anime_guia.model.TestApiData
import retrofit2.Call
import retrofit2.http.GET

interface AnimeAPIService {

    @GET(".json")
    fun getTopAnimeList(): Call<TestApiData>
}