package com.example.cse226

import android.R.attr.rating
import android.content.Context
import android.media.Rating
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast

class ProductAdapter(private val context: Context, private val dataSource: List<ProductItem>) : BaseAdapter() {
    private val inflater : LayoutInflater = LayoutInflater.from(context)

    override fun getCount() = dataSource.size

    override fun getItem(position: Int) = dataSource[position]

    override fun getItemId(position: Int) = position.toLong()

    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup?
    ): View? {
        val rowView = convertView ?: inflater.inflate(R.layout.list_products, parent, false)
        val imageView = rowView.findViewById<ImageView>(R.id.pic)
        val titleText = rowView.findViewById<TextView>(R.id.title)
        val priceText = rowView.findViewById<TextView>(R.id.price)
        val ratingText = rowView.findViewById<TextView>(R.id.rating)
        val addBtn = rowView.findViewById<Button>(R.id.add)

        addBtn.setOnClickListener {
            Toast.makeText(context, "Product has been added", Toast.LENGTH_SHORT).show()
        }

        val item = getItem(position) as ProductItem
        imageView.setImageResource(item.imageResId)
        titleText.text = item.title
        priceText.text = item.price
        ratingText.text = "⭐ " + item.rating

        return rowView
    }
}