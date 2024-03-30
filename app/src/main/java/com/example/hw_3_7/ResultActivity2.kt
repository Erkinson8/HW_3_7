package com.example.hw_3_7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw_3_7.databinding.ActivityResult2Binding


class ResultActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityResult2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResult2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("song_name")
        val singer = intent.getStringExtra("song_singer")
        val time = intent.getStringExtra("song_time")
        binding.tvSong2.text = name.toString()
        binding.tvSinger2.text = singer.toString()
        binding.tvTime2.text = time.toString()

    }
}