package com.vibgreon.emicalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.pow

class NewActivity112 : AppCompatActivity() {

    lateinit var numP: EditText
    lateinit var numD: EditText
    lateinit var numI: EditText
    lateinit var numL: EditText
    lateinit var numR: TextView
    lateinit var btnR: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new112)

        numP = findViewById(R.id.etPrime)
        numD = findViewById(R.id.etDown)
        numI = findViewById(R.id.etInter)
        numL = findViewById(R.id.etLoan)
        numR = findViewById(R.id.txtResult)
        btnR = findViewById(R.id.btnEMI)

        btnR.setOnClickListener {
            var P = numP.text.toString().toDouble()
            var D = numD.text.toString().toDouble()
            var I = numI.text.toString().toDouble()
            var L = numL.text.toString().toDouble()

            var i = I/100
            var sub = P-D
            var pww= (1+i).pow(L)


            var res = sub * ( i * pww)/(pww-1)

            var num = res.toString()
            numR.text = num
        }

    }
}