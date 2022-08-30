package com.example.anime_guia.view

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.anime_guia.databinding.AnimeDetailLayoutBinding
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer

class ShowAnimeDetailActivity : YouTubeBaseActivity(), YouTubePlayer.OnInitializedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bindingDetailView = AnimeDetailLayoutBinding.inflate(layoutInflater)
        setContentView(bindingDetailView.root)
        val  view = bindingDetailView.youtubePlayer
        loadAnimeCover("https://cdn.myanimelist.net/images/anime/1223/96541.jpg", bindingDetailView.root.context,
            bindingDetailView.AnimeCover)
        view.initialize("AIzaSyBYYK35yBg_7EWi-DhFxDOV2ls1s-Vi_Xw",this)
    }

    private fun loadAnimeCover(URL: String, context: Context, coverView:ImageView){
        Glide
            .with(context)
            .load(URL)
            .centerCrop()
            .into(coverView)
    }

    // Youtube Player init Method
    override fun onInitializationSuccess(
        p0: YouTubePlayer.Provider?,
        p1: YouTubePlayer?,
        p2: Boolean
    ) {
        if (!p2) {
            p1!!.cueVideo("--IcmZkvL0Q");
        }
    }

    override fun onInitializationFailure(
        p0: YouTubePlayer.Provider?,
        p1: YouTubeInitializationResult?
    ) {
        Toast.makeText(this,"Error Initializing Video", Toast.LENGTH_SHORT).show()
    }
}