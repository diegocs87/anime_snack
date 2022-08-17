package com.example.anime_guia.view.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.inflate
import com.example.anime_guia.R
import com.example.anime_guia.databinding.AnimeCardViewItemBinding
import com.example.anime_guia.databinding.FragmentMainScreenBinding
import com.example.anime_guia.model.Anime

class MainRecyclerAdapter(private val animes : List<Anime>) : Adapter<MainRecyclerAdapter.CardHolder>() {

    lateinit var cardViewItemBinding:AnimeCardViewItemBinding;

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardHolder {
        cardViewItemBinding = AnimeCardViewItemBinding.inflate(LayoutInflater.from(parent.context),
            parent, false);
        return CardHolder(cardViewItemBinding);
    }

    override fun onBindViewHolder(cardholder: CardHolder, position: Int) {
        cardholder.setAnimeDataCard(animes[position])
    }

    override fun getItemCount(): Int = animes.size

    class CardHolder(private val cardViewBinding: AnimeCardViewItemBinding):
        RecyclerView.ViewHolder(cardViewBinding.root) {

        fun setAnimeDataCard (animeId: Anime){
            cardViewBinding.tvDate.text = animeId.score
            cardViewBinding.tvTitle.text = animeId.tittle
            cardViewBinding.tvCategory.text = animeId.kind
        }
    }

}