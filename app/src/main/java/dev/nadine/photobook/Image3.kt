package dev.nadine.photobook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Image3 : AppCompatActivity() {
    lateinit var btnPrevious2: Button
    lateinit var btnNext2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image3)
        btnPrevious2 = findViewById(R.id.btnPrevious2)
        btnPrevious2.setOnClickListener {
            intent = Intent(this, image2::class.java)
            startActivity(intent)
        }
        btnNext2 = findViewById(R.id.btnNext2)
        btnNext2.setOnClickListener {
            intent = Intent(this, Image4::class.java)
            startActivity(intent)
        }
    }
}