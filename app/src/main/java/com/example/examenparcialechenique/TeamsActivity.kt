package com.example.examenparcialechenique

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class TeamsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_teams)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val teams = arrayOf(
            "Argentina","Brasil","Uruguay","Colombia","Estados Unidos","Perú","Canada","México","Trinidad y Tobago"
        )
        val btnGo2Menu: Button = findViewById(R.id.btnGo2Menu)
        val lvTeams: ListView = findViewById(R.id.lvTeams)

        val adaptador: Any =
            ArrayAdapter<Any?>(this,android.R.layout.simple_list_item_1,teams)
        lvTeams.adapter = adaptador as ListAdapter



        btnGo2Menu.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}