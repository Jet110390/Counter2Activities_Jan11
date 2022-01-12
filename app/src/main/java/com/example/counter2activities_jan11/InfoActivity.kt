package com.example.counter2activities_jan11

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.counter2activities_jan11.databinding.NameInfoBinding



class InfoActivity: AppCompatActivity() {
    private lateinit var binding: NameInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = NameInfoBinding.inflate(layoutInflater)
        //binds xml to the activity
        setContentView(binding.root)

//use the same object
        with(binding) {
            submitButton.setOnClickListener {
                startSecondActivity()
//

            }


        }


}

    private fun startSecondActivity(){
        val firstName =binding.firstNameEt.text.toString()
        val lastName=binding.lastNameEt.text.toString()
        val email=binding.emailEt.text.toString()
        val intent = Intent(this@InfoActivity,DisplayActivity::class.java).also {
            it.putExtra(FIRST_NAME_EXTRA,firstName)
            it.putExtra(LAST_NAME_EXTRA,lastName)
            it.putExtra(EMAIL_EXTRA,email)
        }
        startActivity(intent)

    }    }