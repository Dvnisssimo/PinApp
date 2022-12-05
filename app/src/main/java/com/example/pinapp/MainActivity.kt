package com.example.pinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bt1 = findViewById<Button>(R.id.bt1)
        val bt2 = findViewById<Button>(R.id.bt2)
        val bt3 = findViewById<Button>(R.id.bt3)
        val bt4 = findViewById<Button>(R.id.bt4)
        val bt5 = findViewById<Button>(R.id.bt5)
        val bt6 = findViewById<Button>(R.id.bt6)
        val bt7 = findViewById<Button>(R.id.bt7)
        val bt8 = findViewById<Button>(R.id.bt8)
        val bt9 = findViewById<Button>(R.id.bt9)
        val bt0 = findViewById<Button>(R.id.bt0)
        val tvmain = findViewById<TextView>(R.id.textView)

        bt1.setOnClickListener {
            tvtext(1)
        }
        bt2.setOnClickListener {
            tvtext(2)
        }
        bt3.setOnClickListener {
            tvtext(3)
        }
        bt4.setOnClickListener {
            tvtext(4)
        }
        bt5.setOnClickListener {
            tvtext(5)
        }
        bt6.setOnClickListener {
            tvtext(6)
        }
        bt7.setOnClickListener {
            tvtext(7)
        }
        bt8.setOnClickListener {
            tvtext(8)
        }
        bt9.setOnClickListener {
            tvtext(9)
        }
        bt0.setOnClickListener {
            tvtext(0)
        }
    }

    fun tvtext(x: Int) {
        val tvmain = findViewById<TextView>(R.id.textView)
        tvmain.setText(tvmain.text.toString() + "$x")
        if (tvmain.text.length > 4) {
            tvmain.setText(tvmain.text.drop(1).toString())
        }
        if (tvmain.text.toString() == "9999") {
            Toast.makeText(applicationContext,"Поздравляем, вы ввели правильный пароль!",Toast.LENGTH_SHORT).show()
            tvmain.setText("")
        }
    }
}