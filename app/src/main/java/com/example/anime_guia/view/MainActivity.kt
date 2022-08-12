package com.example.anime_guia.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.anime_guia.databinding.ActivityMainBinding
import com.example.anime_guia.view.adapters.MainPagerAdapter
import com.google.firebase.database.*

class MainActivity : AppCompatActivity() {
    private val mainPagerAdapter by lazy { MainPagerAdapter(this)}
    private lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        mainBinding.mainPager.adapter = mainPagerAdapter
    }
}