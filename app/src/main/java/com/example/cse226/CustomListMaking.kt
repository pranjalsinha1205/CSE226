package com.example.cse226

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CustomListMaking : AppCompatActivity() {
    private lateinit var listView: ListView // this is the list view object

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_custom_list_making)

        listView = findViewById(R.id.listView) // attached it to the list view in the layout

        val myItems = listOf(
            MyItem("Mobile App Development", "This is an android app", R.drawable.android, "Patna"),
            MyItem("IOS App Development", "This is an iphone app", R.drawable.ios, "Gaya"),
            MyItem("Web App Development", "This is a web app", R.drawable.web, "Gurgaon")
        )

        val adapter = MyAdapter(this, myItems)
        listView.adapter = adapter

        listView.setOnItemClickListener { parent, view, position, id ->
            val item = myItems[position]
            Toast.makeText(this@CustomListMaking, "Clicked on ${item.title}", Toast.LENGTH_SHORT)
                .show()
        }
    }
}