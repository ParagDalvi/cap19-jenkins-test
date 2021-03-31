package com.example.cap19

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        nextBtn.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }
}

//893ec34195f14ea19c5ea5ee9994c563
