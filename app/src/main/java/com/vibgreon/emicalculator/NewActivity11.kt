package com.vibgreon.emicalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class NewActivity11 : AppCompatActivity() {

    lateinit var btnMem: Button
    lateinit var btnG: Button
    lateinit var etPass: EditText
    val vPassword = arrayOf("vivek", "udeshya")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new11)

        btnMem = findViewById(R.id.btnMember)
        btnG = findViewById(R.id.btnGuest)
        etPass = findViewById(R.id.etPass)



        btnMem.setOnClickListener {

            val password = etPass.text.toString()

            var memName = "nigga"

            val intent = Intent(this@NewActivity11, NewActivity111::class.java)

            if (vPassword.contains(password)){
                if(password == vPassword[0]){
                    memName = "Welcome, Vivek"
                    intent.putExtra("Name", memName)
                    startActivity(intent)

                } else if(password == vPassword[1]){
                    memName = "Welcome, Udeshya"
                    intent.putExtra("Name", memName)
                    startActivity(intent)

                }
            }
            else {
                Toast.makeText(this@NewActivity11, "Incorrect Credentials", Toast.LENGTH_LONG).show()
            }
        }

        btnG.setOnClickListener {
            val intent = Intent(this@NewActivity11, NewActivity113::class.java)
            startActivity(intent)
        }


    }
}