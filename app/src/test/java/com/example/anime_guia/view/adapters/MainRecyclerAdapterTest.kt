package com.example.anime_guia.view.adapters

import com.example.anime_guia.model.Anime
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.MockK
import junit.framework.TestCase
import org.junit.Before
import org.junit.Test

class MainRecyclerAdapterTest : TestCase(){

    @MockK
    lateinit var cardHolder: MainRecyclerAdapter.CardHolder
    lateinit var aniList: List<Anime>

    @Before
    fun onBefore(){
        MockKAnnotations.init(this)
        aniList = emptyList()
    }

    @Test
    fun onEmptyRecyclerObject (){

    }

}