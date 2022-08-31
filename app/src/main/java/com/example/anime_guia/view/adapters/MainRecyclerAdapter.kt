package com.example.anime_guia.view.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.bumptech.glide.Glide
import com.example.anime_guia.databinding.AnimeCardViewItemBinding
import com.example.anime_guia.model.Anime

class MainRecyclerAdapter(private val animes: List<Anime>, private val animeItemClickedListener: (Anime) -> Unit) : Adapter<MainRecyclerAdapter.CardHolder>() {

    lateinit var cardViewItemBinding:AnimeCardViewItemBinding;

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardHolder {
        cardViewItemBinding = AnimeCardViewItemBinding.inflate(LayoutInflater.from(parent.context),
            parent, false);
        return CardHolder(cardViewItemBinding);
    }

    override fun onBindViewHolder(cardholder: CardHolder, position: Int) {
        val animeId = animes[position]
        cardholder.setAnimeDataCard(animeId)
        cardholder.itemView.setOnClickListener { animeItemClickedListener(animeId) }
    }

    override fun getItemCount(): Int = animes.size

    class CardHolder(private val cardViewBinding: AnimeCardViewItemBinding):
        RecyclerView.ViewHolder(cardViewBinding.root) {

        fun setAnimeDataCard (animeId: Anime){
            cardViewBinding.animeTittle.text = animeId.tittle
            cardViewBinding.kindTV.text = animeId.kind
            cardViewBinding.capitulostv.text = animeId.score
            Glide
                .with(cardViewBinding.root.context)
                .load(animeId.cover)
                .centerCrop()
                .into(cardViewBinding.imgAnime);
        }
    }
}