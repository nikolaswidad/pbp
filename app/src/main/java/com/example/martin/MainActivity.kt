package com.example.martin

import android.app.DatePickerDialog
import android.content.Intent
import android.icu.text.SimpleDateFormat
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val namalengkap = findViewById<EditText>(R.id.namalengkap)
        val tglLahir = findViewById<EditText>(R.id.tgllahir)
        val tempat = findViewById<EditText>(R.id.tempatlahir)



        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        tglLahir.setOnClickListener {
            val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, mYear, monthOfYear, dayOfMonth ->

                val simpleDateFormat = SimpleDateFormat("EEEE")
                val date = Date(mYear, monthOfYear, dayOfMonth - 1)
                val dayString = simpleDateFormat.format(date) //returns true day name for current month only

                tglLahir.setText("$dayOfMonth/${monthOfYear + 1}/$mYear")

            }, year, month, day)

            dpd.show()
        }
        btnRegisterListener()
    }
    private fun btnRegisterListener(){
        daftar.setOnClickListener{
            val namaLengkap = namalengkap.text.toString()
            val tglLahir = tgllahir.text.toString()
            val tempat = tempatlahir.text.toString()
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("namaLengkap", namaLengkap)
            intent.putExtra("tglLahir", tglLahir)
            intent.putExtra("tempat", tempat)
            startActivity(intent);
        }
    }

}