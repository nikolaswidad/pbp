package com.example.martin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val namaLengkap = findViewById<TextView>(R.id.namaLengkap)
        val tglLahir = findViewById<TextView>(R.id.tglLahir)
        val tempatLahir = findViewById<TextView>(R.id.tempatLahir)
        val intent = intent

        val name = intent.getStringExtra("namaLengkap")
        val date = intent.getStringExtra("tglLahir")
        val place = intent.getStringExtra("tempat")


        namaLengkap.text = name
        tglLahir.text = date
        tempatLahir.text = place
    }
}