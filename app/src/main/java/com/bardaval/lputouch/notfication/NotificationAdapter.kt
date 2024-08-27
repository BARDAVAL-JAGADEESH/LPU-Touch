package com.bardaval.lputouch.notfication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bardaval.lputouch.R

class NotificationAdapter(private var notificationList: List<String>) :
    RecyclerView.Adapter<NotificationAdapter.NotificationViewHolder>() {

    private val originalList = notificationList.toMutableList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_notification, parent, false)
        return NotificationViewHolder(view)
    }

    override fun onBindViewHolder(holder: NotificationViewHolder, position: Int) {
        holder.bind(notificationList[position])
    }

    override fun getItemCount(): Int {
        return notificationList.size
    }

    fun filter(query: String) {
        notificationList = originalList.filter {
            it.contains(query, ignoreCase = true)
        }
        notifyDataSetChanged()
    }

    fun resetList() {
        notificationList = originalList
        notifyDataSetChanged()
    }

    class NotificationViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val notificationTextView: TextView = itemView.findViewById(R.id.notification_text_view)

        fun bind(notification: String) {
            notificationTextView.text = notification
        }
    }
}
