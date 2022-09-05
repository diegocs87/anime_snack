package com.example.anime_guia.view.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.anime_guia.databinding.FragmentMainScreenBinding
import com.example.anime_guia.model.Anime
import com.example.anime_guia.model.network.AnimeAPIBuilder
import com.example.anime_guia.view.ShowAnimeDetailActivity
import com.example.anime_guia.view.adapters.MainRecyclerAdapter
import kotlin.concurrent.thread

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MainScreenFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainScreenFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private var Fragmentbinding: FragmentMainScreenBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    //private val binding get() = Fragmentbinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //val view = binding.root
        Fragmentbinding = FragmentMainScreenBinding.inflate(inflater, container, false)
        Fragmentbinding!!.mainScreenRecycler.adapter = MainRecyclerAdapter(
            getAnimeList()
        ) { anime ->
            navigateTo()
        };
        arguments?.takeIf { it.containsKey(ARG_OBJECT) }?.apply {
            //Fragmentbinding!!.fragment1tv.text = "freagment id: " + getInt(ARG_OBJECT).toString()
        }
        thread {
            val res = AnimeAPIBuilder.service.getTopAnimeList()
            val body = res.execute().body()
            if(body != null){
                println("body no null size:" +body.get(1).episodes)
            }
            else{
                println("body null")
            }
        }
        return Fragmentbinding!!.root
        // Inflate the layout for this fragment
    }

    private fun navigateTo(){
        val intent = Intent(context, ShowAnimeDetailActivity::class.java)
        startActivity(intent)
    }

    private fun getAnimeList(): List<Anime>{
        return emptyList()
    }

    companion object {

        private const val ARG_OBJECT: String = "object"
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MainScreenFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MainScreenFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}