package com.bardaval.lputouch.rmscategoery

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.bardaval.lputouch.R

class RMSFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_r_m_s, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnSubmit = view.findViewById<Button>(R.id.btn_submit)

        // Handle button click
        btnSubmit.setOnClickListener {
            // Create an Intent to start the RmsLogin activity
            val intent = Intent(activity, RmsLogin::class.java)
            startActivity(intent)
        }
    }
}
