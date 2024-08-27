package com.bardaval.lputouch.notfication

import android.os.Bundle
import android.text.TextUtils
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bardaval.lputouch.R

class Notification : AppCompatActivity() {

    private lateinit var notificationRecyclerView: RecyclerView
    private lateinit var notificationAdapter: NotificationAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifiaction)

        // Set up the toolbar with a back button
        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toolbar.setNavigationOnClickListener {
            onBackPressed()
        }

        // Set up the RecyclerView
        notificationRecyclerView = findViewById(R.id.notification_recycler_view)
        notificationRecyclerView.layoutManager = LinearLayoutManager(this)
        notificationAdapter = NotificationAdapter(getNotifications())
        notificationRecyclerView.adapter = notificationAdapter

        // Set up the SearchView
        val searchView = findViewById<SearchView>(R.id.search_view)
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                if (!TextUtils.isEmpty(newText)) {
                    notificationAdapter.filter(newText!!)
                } else {
                    notificationAdapter.resetList()
                }
                return true
            }
        })
    }

    private fun getNotifications(): List<String> {
        // Replace this with your actual data source
        return listOf(
            "Notification 1",
            "Notification 2",
            "Notification 3",
            "Notification 4",
            "Notification 5"
        )
    }
}
