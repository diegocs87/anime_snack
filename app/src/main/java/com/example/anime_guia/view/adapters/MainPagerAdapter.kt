package com.example.anime_guia.view.adapters

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.anime_guia.view.fragments.MainScreenFragment

class MainPagerAdapter (fragment: FragmentActivity) : FragmentStateAdapter(fragment) {

    companion object{
        private const val ARG_OBJECT: String = "object"
    }
    override fun getItemCount(): Int = 4

    override fun createFragment(position: Int): Fragment {
        // Return a NEW fragment instance in createFragment(int)
        val fragment = MainScreenFragment()
        fragment.arguments = Bundle().apply {
            // Our object is just an integer :-P
            putInt(ARG_OBJECT, position + 1)
        }
        return fragment
    }
}