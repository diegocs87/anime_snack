package com.example.anime_guia.view.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.inflate
import com.example.anime_guia.R
import com.example.anime_guia.model.Anime

class MainRecyclerAdapter(private val animes : List<Anime>) : Adapter<MainRecyclerAdapter.viewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        return viewHolder(LayoutInflater.from(parent.context).
        inflate(R.layout.anime_card_view_item, parent, false))
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int = animes.size

    class viewHolder(view : View): RecyclerView.ViewHolder(view) {

    }

}