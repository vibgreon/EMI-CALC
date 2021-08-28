package com.vibgreon.emicalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class NewActivity1 : AppCompatActivity() {

    lateinit var btnNext: Button
    lateinit var btnSkip: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new1)

        btnNext = findViewById(R.id.btnNext23)
        btnSkip = findViewById(R.id.btnSkip23)

        btnSkip.setOnClickListener {
            val intent = Intent(this@NewActivity1, NewActivity2::class.java)
            startActivity(intent)
        }

        btnNext.setOnClickListener {
            val intent = Intent(this@NewActivity1, NewActivity2::class.java)
            startActivity(intent)
        }
    }
}