package com.agustiawan.bangunruang

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class BalokActivity : AppCompatActivity() {
    lateinit var ed_panjang : EditText
    lateinit var ed_tinggi : EditText
    lateinit var ed_lebar : EditText
    lateinit var btn_hitung : Button
    lateinit var tv_hasil : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_balok)

        ed_lebar = findViewById(R.id.ed_lebar)
        ed_tinggi = findViewById(R.id.ed_tinggi)
        ed_panjang = findViewById(R.id.ed_panjang)

        tv_hasil = findViewById(R.id.tv_hasil)
        btn_hitung = findViewById(R.id.btn_hitung_balok)

        btn_hitung.setOnClickListener {
            var lebar : Int = Integer.parseInt(ed_lebar.text.toString())
            var tinggi : Int = Integer.parseInt(ed_tinggi.text.toString())
            var panjang : Int = Integer.parseInt(ed_panjang.text.toString())

            var hasil : Int = panjang*lebar*tinggi

            tv_hasil.text = hasil.toString()
        }
    }
}