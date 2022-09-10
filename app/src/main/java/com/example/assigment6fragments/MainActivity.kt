package com.example.assigment6fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var cnt=0
        var txtfr=findViewById<TextView>(R.id.frtxt)
        var bt=findViewById<Button>(R.id.bfr1)
     txtfr.text=cnt.toString()
       bt.setOnClickListener {
            cnt=cnt+1
           txtfr.text=cnt.toString()
        }
    }
}