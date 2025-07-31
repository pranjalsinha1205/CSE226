package com.example.cse226

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CalculateArea : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_calculate_area)

        val length = findViewById<EditText>(R.id.length)
        val breadth = findViewById<EditText>(R.id.breadth)
        val calculate = findViewById<Button>(R.id.calculate)

        calculate.setOnClickListener {
            val len = length.text.toString()
            val bread = breadth.text.toString()

            var msg = ""

            if (len == "" || bread == "") msg = "0"
            else {
                val area = len.toDouble() * bread.toDouble()
                msg = area.toString()
            }
            Toast.makeText(this, "The area is: $msg", Toast.LENGTH_LONG).show()
        }
    }
}