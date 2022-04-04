package com.agustiawan.bangunruang

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btn_kubus : Button
    lateinit var btn_balok : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_kubus = findViewById(R.id.btnkubus)
        btn_balok = findViewById(R.id.btnbalok)
        
        // memberi action pada button kubus dan balok

        btn_kubus.setOnClickListener {
            var intent = Intent(this, KubusActivity::class.java)
            startActivity(intent)
            
            // untuk mengaktifkan intents pada kubus
        }

        btn_balok.setOnClickListener {
            var intent = Intent(this, BalokActivity::class.java)
            startActivity(intent)
            
            // untuk mengaktifkan intents pada balok
        }
    }
}
