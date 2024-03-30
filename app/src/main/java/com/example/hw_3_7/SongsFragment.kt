package com.example.hw_3_7

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.hw_3_7.databinding.FragmentSongsBinding

class SongsFragment : Fragment() {

    private lateinit var binding: FragmentSongsBinding

    private val songList = arrayListOf(
        Song("Опера", "Любэ", "3:00"),
        Song("Эсимде", "Бегиш", "2:58"),
        Song("Бул дүйнө", "Мирбек Атабеков", "5:00"),
        Song("Ким билет", "Jax", "2:46"),
        Song("Монако", "Люся Чеботина", "3:09"),
        Song("Новый год", "Дисткотека Авария", "2:51"),
        Song("Полковник", "Би 2", "3:04"),
        Song("Afraid", "Eminem", "4:00"),
        Song("Numb", "Linkin Park", "3:15"),
        Song("Chica Bomb", "Dan Balan", "3:10"),
        Song("Candy shop", "50 cent", "2:56")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSongsBinding.inflate(layoutInflater)
        initRecycler()
        return binding.root
    }

    private fun initRecycler() {
        val adapter = SongsAdapter(songList)
        binding.rvSongs.adapter = adapter
        binding.rvSongs.layoutManager = GridLayoutManager(requireContext(), 1)
    }

}


