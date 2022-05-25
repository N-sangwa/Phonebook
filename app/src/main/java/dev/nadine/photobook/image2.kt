package dev.nadine.photobook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class image2 : AppCompatActivity() {
    lateinit var btnPrevious1: Button
    lateinit var btnNext1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image2)
       btnPrevious1 = findViewById(R.id.btnPrevious1)
        btnPrevious1.setOnClickListener {
            intent = Intent(this,MainActivity::class.java )
            startActivity(intent)
        }
        btnNext1 = findViewById(R.id.btnNext1)
        btnNext1.setOnClickListener {
            intent = Intent(this,Image3::class.java)
            startActivity(intent)
        }

    }
}