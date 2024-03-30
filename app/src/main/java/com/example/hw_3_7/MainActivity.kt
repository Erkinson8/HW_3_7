package com.example.hw_3_7


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout

import com.example.hw_3_7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view:ConstraintLayout = binding.root
        setContentView(view)

        val fragmentA = ImageFragment()
        val fragmentB = SongsFragment()

        supportFragmentManager.beginTransaction()
            .replace(R.id.containerA, fragmentA)
            .commit()

        supportFragmentManager.beginTransaction()
            .replace(R.id.containerB, fragmentB)
            .commit()
    }
}
