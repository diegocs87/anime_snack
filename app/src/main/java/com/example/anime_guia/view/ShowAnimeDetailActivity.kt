package com.example.anime_guia.view

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.anime_guia.databinding.AnimeDetailLayoutBinding
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerView

class ShowAnimeDetailActivity : YouTubeBaseActivity(), YouTubePlayer.OnInitializedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bindingDetailView = AnimeDetailLayoutBinding.inflate(layoutInflater)
        setContentView(bindingDetailView.root)
        Glide
            .with(bindingDetailView.root.context)
            .load("https://cdn.myanimelist.net/images/anime/1223/96541.jpg")
            .centerCrop()
            .into(bindingDetailView.AnimeCover)
        val  view = bindingDetailView.youtubePlayer
        view.initialize("AIzaSyBYYK35yBg_7EWi-DhFxDOV2ls1s-Vi_Xw",this)
    }

    override fun onInitializationSuccess(
        p0: YouTubePlayer.Provider?,
        p1: YouTubePlayer?,
        p2: Boolean
    ) {
        if (!p2) {
            println("on p2")
            p1!!.cueVideo("--IcmZkvL0Q");
        }
    }

    override fun onInitializationFailure(
        p0: YouTubePlayer.Provider?,
        p1: YouTubeInitializationResult?
    ) {
        TODO("Not yet implemented")
    }
}