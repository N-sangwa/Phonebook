package dev.nadine.photobook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Image5 : AppCompatActivity() {
    lateinit var btnPrevious5 : Button
    lateinit var btnNext5 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image5)
        btnPrevious5 = findViewById(R.id.btnPrevious5)
        btnPrevious5.setOnClickListener {
            intent = Intent(this,Image4::class.java)
            startActivity(intent)
        }

        }
    }
