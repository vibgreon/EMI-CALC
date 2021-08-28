package com.vibgreon.emicalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var btnNext: Button
    lateinit var btnSkip: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnNext = findViewById(R.id.btnNext12)
        btnSkip = findViewById(R.id.btnSkip13)

        btnSkip.setOnClickListener {
            val intent = Intent(this@MainActivity, NewActivity2::class.java)
            startActivity(intent)
        }

        btnNext.setOnClickListener {
            val intent = Intent(this@MainActivity, NewActivity1::class.java)
            startActivity(intent)
        }
    }
}