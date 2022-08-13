package com.example.anime_guia.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.anime_guia.databinding.ActivityMainBinding
import com.example.anime_guia.view.adapters.MainPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator
import com.example.anime_guia.R;
import com.google.android.material.tabs.TabLayout

//import com.google.firebase.database.*

class MainActivity : AppCompatActivity() {

    private val mainPagerAdapter by lazy { MainPagerAdapter(this)}
    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        mainBinding.mainPager.adapter = mainPagerAdapter
        setTabLayouMediator()
    }

    private fun setTabLayouMediator(){
        TabLayoutMediator(mainBinding.mainTabLayout, mainBinding.mainPager) { tabId, position ->
            setMainTabsFeatures(tabId,position)
        }.attach()
    }

    private fun setMainTabsFeatures(tabId:TabLayout.Tab, position:Int){
        when (position){
            0 -> {tabId.text = "Más Vistos"
                tabId.setIcon(R.drawable.ic_populars_icon)}
            1-> {tabId.text = "Favoritos"
                tabId.setIcon(R.drawable.ic_favs_icon)
            }
            2 -> {tabId.text = "Recomendados"
                tabId.setIcon(R.drawable.ic_best_rating_icon)}
            3 -> {tabId.text = "Genéros"
                tabId.setIcon(R.drawable.ic_types_icon)}
        }
    }
}