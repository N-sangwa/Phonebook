package dev.nadine.photobook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnContinue: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnContinue = findViewById(R.id.btnContinue)
        btnContinue.setOnClickListener {
            intent = Intent(this,image2::class.java)
            startActivity(intent)

        }
    }
}