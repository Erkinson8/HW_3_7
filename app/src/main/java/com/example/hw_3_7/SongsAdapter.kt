package com.example.hw_3_7

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_3_7.databinding.ItemSongsBinding

class SongsAdapter(private val listSongs: List<Song>) : RecyclerView.Adapter<SongsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongsViewHolder {
        return SongsViewHolder(
            ItemSongsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            )
        )
    }

    override fun getItemCount(): Int {
        return listSongs.size
    }

    override fun onBindViewHolder(holder: SongsViewHolder, position: Int) {
        holder.bind(listSongs[position])
    }
}

@Suppress("DEPRECATION")
class SongsViewHolder(private val binding: ItemSongsBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(song: Song) {
        val displayPosition = position + 1
        binding.tvSong.text = song.name
        binding.tvSinger.text = song.singer
        binding.tvTime.text = song.time
        binding.tvNumber.text = displayPosition.toString()
        itemView.setOnClickListener {

            val intent = Intent(itemView.context, ResultActivity2::class.java).apply {
                putExtra("song_name", song.name)
                putExtra("song_singer", song.singer)
                putExtra("song_time", song.time)
            }
            itemView.context.startActivity(intent)
        }
    }
}



