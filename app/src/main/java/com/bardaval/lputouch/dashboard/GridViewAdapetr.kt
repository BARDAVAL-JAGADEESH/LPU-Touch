package com.bardaval.lputouch.dashboard

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bardaval.lputouch.R

class GridViewAdapter(
    private val context: Context,
    private val arrayListImage: ArrayList<Int>,
    private val name: Array<String>
) : BaseAdapter() {

    override fun getCount(): Int {
        return arrayListImage.size
    }

    override fun getItem(position: Int): Any {
        return arrayListImage[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val myView: View
        val holder: ViewHolder

        if (convertView == null) {
            val mInflater = LayoutInflater.from(context)
            myView = mInflater.inflate(R.layout.grid_item, parent, false)
            holder = ViewHolder()
            holder.mImageView = myView.findViewById(R.id.imageView)
            holder.mTextView = myView.findViewById(R.id.textView)
            holder.mBadgeTextView = myView.findViewById(R.id.badge)
            myView.tag = holder
        } else {
            myView = convertView
            holder = myView.tag as ViewHolder
        }

        holder.mImageView.setImageResource(arrayListImage[position])
        holder.mTextView.text = name[position]

        // Example logic to show badge
        if (position % 2 == 0) {  // For example, show badge on every even position
            holder.mBadgeTextView.text = "1"
            holder.mBadgeTextView.visibility = View.VISIBLE
        } else {
            holder.mBadgeTextView.visibility = View.GONE
        }

        holder.mTextView.setOnClickListener {
            val intent = Intent(context, GridItmesDeatailsActivity::class.java)
            intent.putExtra("name", name[position])
            context.startActivity(intent)
        }

        return myView
    }

    private class ViewHolder {
        lateinit var mImageView: ImageView
        lateinit var mTextView: TextView
        lateinit var mBadgeTextView: TextView
    }
}
