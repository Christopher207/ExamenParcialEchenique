package com.example.examenparcialechenique

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.roundToLong

class PrizesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_prizes)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val etAmount: EditText = findViewById(R.id.etAmount)
        val btnCalculate: Button = findViewById(R.id.btnCalculate)
        val btnGoMenu: Button = findViewById(R.id.btnGoMenu)
        val tv1place: TextView = findViewById(R.id.tv1place)
        val tv2place: TextView = findViewById(R.id.tv2place)
        val tv3place: TextView = findViewById(R.id.tv3place)
        val tvRest: TextView = findViewById(R.id.tvRest)
        btnCalculate.setOnClickListener {
            val primer = etAmount.text.toString().toFloat()*0.25
            val segundo = etAmount.text.toString().toFloat()*0.15
            val tercer = etAmount.text.toString().toFloat()*0.10
            val resto = ((etAmount.text.toString().toFloat() - primer - segundo - tercer)/13).toString()
            tv1place.text = primer.toString()
            tv2place.text = segundo.toString()
            tv3place.text = tercer.toString()
            tvRest.text = resto
        }
        btnGoMenu.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}