package com.example.cse226

import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ProductList : AppCompatActivity() {
    private lateinit var listView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_product_list)
        listView = findViewById(R.id.listView)

        val productItems = listOf(
            ProductItem("Shoes", "$18.99", R.drawable.shoes, "4.5"),
            ProductItem("Bag", "$8.99", R.drawable.bag, "4.0"),
            ProductItem("Watch", "$30.99", R.drawable.watch, "3.5"),
            ProductItem("Headphone", "$48.99", R.drawable.headphone, "2.5")
        )

        val adapter = ProductAdapter(this, productItems)
        listView.adapter = adapter

        listView.setOnItemClickListener { parent, view, position, id ->
            val item = productItems[position]
            Toast.makeText(this@ProductList, "Clicked on ${item.title}", Toast.LENGTH_SHORT).show()
        }
    }
}