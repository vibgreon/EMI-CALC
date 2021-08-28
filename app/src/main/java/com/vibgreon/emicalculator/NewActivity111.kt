package com.vibgreon.emicalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class NewActivity111 : AppCompatActivity() {

    lateinit var btnNxtEmi: Button
    lateinit var btnInf: Button

    var titleName: String? = "nigga"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new111)

        if (intent != null){
            titleName = intent.getStringExtra("Name")
        }

        title = titleName

        btnNxtEmi = findViewById(R.id.btnSwitchEmi)
        btnInf = findViewById(R.id.btnAbout)

        btnNxtEmi.setOnClickListener {
            val intent = Intent(this@NewActivity111, NewActivity112::class.java)
            startActivity(intent)
        }

        btnInf.setOnClickListener {
            val intent = Intent(this@NewActivity111, NewActivity113::class.java)
            startActivity(intent)
        }
    }
}