package com.example.motivation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.motivation.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_user)
        binding.buttonSaveName.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when(view.id){
            R.id.button_save_name -> {

            }
        }
    }
}