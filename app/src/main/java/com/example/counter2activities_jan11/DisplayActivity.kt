package com.example.counter2activities_jan11

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.counter2activities_jan11.databinding.InfoDisplayBinding


class DisplayActivity: AppCompatActivity() {

    private lateinit var binding: InfoDisplayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = InfoDisplayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            firstNameTv.text = intent.getStringExtra(FIRST_NAME_EXTRA)
            lastNameTv.text = intent.getStringExtra(LAST_NAME_EXTRA)
            emailTv.text = intent.getStringExtra(EMAIL_EXTRA)
        }
    }
}