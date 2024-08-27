package com.bardaval.lputouch.happening

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bardaval.lputouch.R

class Myarrayadapter(var mctx: Context, var resources: Int, var items: List<Model>) :
    ArrayAdapter<Model>(mctx, resources, items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(mctx)
        val view: View = layoutInflater.inflate(resources, null)

        val imageView: ImageView = view.findViewById(R.id.image)
        val titleTextView: TextView = view.findViewById(R.id.textview1)

        val mItem: Model = items[position]
        imageView.setImageDrawable(mctx.resources.getDrawable(mItem.img))
        titleTextView.text = mItem.title

        // Set OnClickListener for the titleTextView to open a new activity with the link
        titleTextView.setOnClickListener {
            val intent = Intent(mctx, NewsDetailActivity::class.java)
            intent.putExtra("url", mItem.link)
            mctx.startActivity(intent)
        }

        return view
    }
}
