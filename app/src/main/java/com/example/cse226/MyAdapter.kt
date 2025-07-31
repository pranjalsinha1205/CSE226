package com.example.cse226

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(private val context: Context, private val dataSource: List<MyItem>) : BaseAdapter() {
    private val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun getCount(): Int = dataSource.size

    override fun getItem(position: Int): Any? = dataSource[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup?
    ): View? {
        val rowView = convertView ?: inflater.inflate(R.layout.list_item, parent, false)
        val imageView = rowView.findViewById<ImageView>(R.id.icon)
        val titleText = rowView.findViewById<TextView>(R.id.title)
        val subtitleText = rowView.findViewById<TextView>(R.id.content)
        val locationText = rowView.findViewById<TextView>(R.id.location)

        val item = getItem(position) as MyItem
        imageView.setImageResource(item.imageResId)
        titleText.text = item.title
        subtitleText.text = item.subtitle
        locationText.text = item.location

        return rowView
    }
}