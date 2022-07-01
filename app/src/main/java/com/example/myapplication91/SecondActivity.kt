package com.example.myapplication91

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val arguments = intent.extras
        val data = arguments?.get("result").toString()

       // val textView = TextView(this)
        val textView = findViewById<TextView>(R.id.textView)
            // textView.textSize = 20f
      //  textView.setPadding(16, 16, 16, 16)
        textView.text = data
       // setContentView(textView)
    }
}