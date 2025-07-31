package com.example.cse226

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_first)

        val toast = findViewById<Button>(R.id.toastBtn)
        val nav = findViewById<Button>(R.id.intentBtn)

        toast.setOnClickListener {
            Toast.makeText(this, "Hello World", Toast.LENGTH_SHORT).show()
        }

        nav.setOnClickListener {
            val int = Intent(this, MainActivity::class.java)
            startActivity(int)
        }
    }
}