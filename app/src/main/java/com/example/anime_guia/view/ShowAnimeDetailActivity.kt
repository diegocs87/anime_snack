package com.example.anime_guia.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.anime_guia.databinding.AnimeDetailLayoutBinding

class ShowAnimeDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bindingDetailView = AnimeDetailLayoutBinding.inflate(layoutInflater)
        setContentView(bindingDetailView.root)
        Glide
            .with(bindingDetailView.root.context)
            .load("https://cdn.myanimelist.net/images/anime/1223/96541.jpg")
            .centerCrop()
            .into(bindingDetailView.AnimeCover)
    }
}