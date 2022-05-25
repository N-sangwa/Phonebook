package dev.nadine.photobook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Image4 : AppCompatActivity() {
    lateinit var btnPrevious4 :Button
    lateinit var btnNext4 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image4)
        btnPrevious4 = findViewById(R.id.btnPrevious4)
        btnPrevious4.setOnClickListener {
            intent = Intent(this,Image3::class.java)
            startActivity(intent)
        }
       btnNext4 = findViewById(R.id.btnNext4)
        btnNext4.setOnClickListener {
            intent = Intent (this,Image5::class.java)
            startActivity(intent)
        }
        }
    }
