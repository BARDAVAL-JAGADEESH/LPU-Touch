package com.bardaval.lputouch.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import androidx.fragment.app.Fragment
import com.bardaval.lputouch.R
class DashboardFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val gridview = view.findViewById<GridView>(R.id.gridview)
        val arrayListImage = arrayListOf(
            R.drawable.announcement, R.drawable.payement, R.drawable.attendence_mark,
            R.drawable.assignment, R.drawable.result, R.drawable.exam,
            R.drawable.library, R.drawable.rmslog, R.drawable.event,
            R.drawable.trives,  R.drawable.bb,
            R.drawable.skill, R.drawable.skill, R.drawable.mess,
            R.drawable.skill, R.drawable.doctor, R.drawable.doctor,
            R.drawable.doctor, R.drawable.doctor, R.drawable.doctor,
            R.drawable.doctor, R.drawable.doctor, R.drawable.doctor
        )

        val name = arrayOf(
            "Announce", "Fee Statement", "Attendance", "Assignment", "Results", "Exams",
            "Library", "RMS Status", "Events", "10 to Thrive",  "View Marks",
            "Announce", "Fee Statement", "Attendance", "Assignment", "Results", "Exams",
            "Library", "RMS Status", "Events", "10 to Thrive", "Back to Basics", "View Marks"

        )

        val customAdapter = GridViewAdapter(requireContext(), arrayListImage, name)
        gridview.adapter = customAdapter
    }
}
