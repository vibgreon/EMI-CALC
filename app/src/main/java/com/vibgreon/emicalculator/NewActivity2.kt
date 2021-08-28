package com.vibgreon.emicalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class NewActivity2 : AppCompatActivity() {

    lateinit var btnContinue: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new2)

        btnContinue = findViewById(R.id.btnStart)

        btnContinue.setOnClickListener {
            val intent = Intent(this@NewActivity2, NewActivity11::class.java)
            startActivity(intent)
        }

    }
}