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
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val gridview = view.findViewById<GridView>(R.id.gridview)
        val arrayListImage = ArrayList<Int>()

        arrayListImage.add(R.drawable.ic_launcher_background)
        arrayListImage.add(R.drawable.ic_launcher_background)
        arrayListImage.add(R.drawable.ic_launcher_background)
        arrayListImage.add(R.drawable.ic_launcher_background)
        arrayListImage.add(R.drawable.ic_launcher_background)
        arrayListImage.add(R.drawable.ic_launcher_background)
        arrayListImage.add(R.drawable.ic_launcher_background)
        arrayListImage.add(R.drawable.ic_launcher_background)
        arrayListImage.add(R.drawable.ic_launcher_background)
        arrayListImage.add(R.drawable.ic_launcher_background)
        arrayListImage.add(R.drawable.ic_launcher_background)
        arrayListImage.add(R.drawable.ic_launcher_background)
        arrayListImage.add(R.drawable.ic_launcher_background)
        arrayListImage.add(R.drawable.ic_launcher_background)
        arrayListImage.add(R.drawable.ic_launcher_background)
        arrayListImage.add(R.drawable.ic_launcher_background)
        arrayListImage.add(R.drawable.ic_launcher_background)
        arrayListImage.add(R.drawable.ic_launcher_background)
        arrayListImage.add(R.drawable.ic_launcher_background)
        arrayListImage.add(R.drawable.ic_launcher_background)
        arrayListImage.add(R.drawable.ic_launcher_background)
        arrayListImage.add(R.drawable.ic_launcher_background)
        arrayListImage.add(R.drawable.ic_launcher_background)

        arrayListImage.add(R.drawable.ic_launcher_background)
        arrayListImage.add(R.drawable.ic_launcher_background)
        arrayListImage.add(R.drawable.ic_launcher_background)
        arrayListImage.add(R.drawable.ic_launcher_background)
        arrayListImage.add(R.drawable.ic_launcher_background)
        arrayListImage.add(R.drawable.ic_launcher_background)
        arrayListImage.add(R.drawable.ic_launcher_background)
        arrayListImage.add(R.drawable.ic_launcher_background)
        arrayListImage.add(R.drawable.ic_launcher_background)

        val name = arrayOf(
            "Bardaval", "Jagadeesh", "Karan", "Bardaval", "Jagadeesh", "Karan", "Srinu", "Dharam",
            "Bardaval", "Jagadeesh", "Karan", "Bardaval", "Jagadeesh", "Karan", "Srinu", "Dharam",
            "Bardaval", "Jagadeesh", "Karan", "Bardaval", "Jagadeesh", "Karan", "Srinu", "Dharam",
            "Bardaval", "Jagadeesh", "Karan", "Bardaval", "Jagadeesh", "Karan", "Srinu", "Dharam"
        )

        val customAdapter = GridViewAdapter(requireContext(), arrayListImage, name)
        gridview.adapter = customAdapter
    }
}
