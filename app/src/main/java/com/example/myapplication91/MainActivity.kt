package com.example.myapplication91

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText_1 = findViewById<EditText>(R.id.editTextTextPersonName1)
        val editText_2 = findViewById<EditText>(R.id.editTextTextPersonName2)

        val button = findViewById<AppCompatButton>(R.id.button)
        val intent = Intent(this, SecondActivity::class.java)

        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                intent.putExtra("result",editText_1.text.toString() + editText_2.text.toString())
                startActivity(intent)
            }
        })

        /*
     fun onClick(view: View?) {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("result",editText_1.text.toString() + editText_2.text.toString())
            startActivity(intent)
        }
         */
    }

}
