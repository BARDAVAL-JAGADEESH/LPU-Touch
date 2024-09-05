package com.bardaval.lputouch.rmscategoery

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.bardaval.lputouch.R

class RmsLogin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rms_login)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        // Hide the default title
        supportActionBar?.setDisplayShowTitleEnabled(false)

        // Set up the back button
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // Set the toolbar title text
        val toolbarTitle: TextView = findViewById(R.id.toolbar_title)
        toolbarTitle.text = "RMS"

        // Handle back button press
        toolbar.setNavigationOnClickListener {
            onBackPressed()
        }

        // Set up message type spinner
        val messageTypeSpinner: Spinner = findViewById(R.id.spinner_message_type)
        val messageTypes = arrayOf("Search","Assistance", "Enquiry", "Feedback")
        val messageTypeAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, messageTypes)
        messageTypeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        messageTypeSpinner.adapter = messageTypeAdapter

        // Set up master category spinner
        val masterCategorySpinner: Spinner = findViewById(R.id.spinner_master_category)
        val masterCategories = arrayOf("Search",
            "Category 1", "Category 2", "Category 3", "Category 4", "Category 5",
            "Category 6", "Category 7", "Category 8", "Category 9", "Category 10"
        )
        val masterCategoryAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, masterCategories)
        masterCategoryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        masterCategorySpinner.adapter = masterCategoryAdapter

        // Set up category spinner
        val categorySpinner: Spinner = findViewById(R.id.spinner_category)
        val categories = arrayOf("Search",
            "Option 1", "Option 2", "Option 3", "Option 4", "Option 5",
            "Option 6", "Option 7", "Option 8", "Option 9", "Option 10"
        )
        val categoryAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, categories)
        categoryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        categorySpinner.adapter = categoryAdapter

        val submitButton: View = findViewById(R.id.btn)
        submitButton.setOnClickListener {
            val selectedMessageType = messageTypeSpinner.selectedItem.toString()
            submitButton.setOnClickListener {
                val intent=Intent(this, Rmsrequestwrite::class.java)
                startActivity(intent)
            }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}
