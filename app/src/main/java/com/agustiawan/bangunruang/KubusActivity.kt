package com.agustiawan.bangunruang

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class KubusActivity : AppCompatActivity() {
    lateinit var ed_Sisi : EditText
    lateinit var tv_hasil : TextView
    lateinit var btn_hitung : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kubus)

        btn_hitung = findViewById(R.id.btn_hitung)
        tv_hasil = findViewById(R.id.tv_hasil)
        ed_Sisi = findViewById(R.id.ed_Sisi)

        btn_hitung.setOnClickListener {
            var sisi : Int =  Integer.parseInt(ed_Sisi.text.toString())
            var volume : Int = sisi*sisi*sisi

            tv_hasil.text = volume.toString()


        }
    }
}