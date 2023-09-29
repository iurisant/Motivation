package com.example.motivation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.motivation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        binding.buttonNewPhrase.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when(view.id){
            R.id.button_new_phrase -> {

            }
        }
    }
}