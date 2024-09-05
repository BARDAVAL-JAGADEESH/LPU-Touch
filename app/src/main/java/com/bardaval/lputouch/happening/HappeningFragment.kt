package com.bardaval.lputouch.happening

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.bardaval.lputouch.R

class HappeningFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_happening, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listView = view.findViewById<ListView>(R.id.myListView)
        val list = mutableListOf<Model>()

        list.add(Model("24 LPU students participating in the Paris Olympics 2024", "", R.drawable.lpuolympic, "https://happenings.lpu.in/24-lpu-students-are-making-up-21-of-the-indian-contingent-at-the-parisolympics2024/"))

        list.add(Model("LPU gives ₹25 lakh cash prize to Phogat", "", R.drawable.cashprize, "https://www.hindustantimes.com/cities/chandigarh-news/lpu-gives-25-lakh-cash-prize-to-phogat-101724953827031.html"))

        list.add(Model("LPU NCC Cadet Navneet Singh represented India in the UK for YEP 2024", "", R.drawable.ncc, "https://happenings.lpu.in/lpu-ncc-cadet-navneet-singh-represented-india-in-the-uk-for-yep-2024/"))
        list.add(Model("cash prizes to its students who represented India at the Paris Olympics. ", "", R.drawable.cashprize, "https://happenings.lpu.in/thousands-of-students-across-the-world-started-their-new-journey-with-enthusiasm-at-lpu/"))
        list.add(Model("Thousands of students across the world started their new journey with enthusiasm at LPU", "", R.drawable.lpumam, "https://happenings.lpu.in/thousands-of-students-across-the-world-started-their-new-journey-with-enthusiasm-at-lpu/"))

        list.add(Model("If Employment Bears Hallmarks\n of Regular GovtServices.", "", R.drawable.logolpu, "https://www.news18.com/news/"))
        list.add(Model("LPU gives ₹25 lakh cash prize to Phogat", "Lpu Live", R.drawable.cashprize, "https://www.hindustantimes.com/cities/chandigarh-news/lpu-gives-25-lakh-cash-prize-to-phogat-101724953827031.html"))
        list.add(Model("LPU strikes deals with Google, SAP, Oracle etc to offer free industry training to students!", "", R.drawable.amalpu, "https://www.lpu.in/latest-news.php"))
        list.add(Model("LPU NCC Cadet Navneet Singh represented India in the UK for YEP 2024", "", R.drawable.ncc, "https://happenings.lpu.in/lpu-ncc-cadet-navneet-singh-represented-india-in-the-uk-for-yep-2024/"))
        list.add(Model("Lovely Professional University (LPU) commenced its academic year 2024 with an engaging Freshman Induction Program", " ", R.drawable.cashprize, "https://happenings.lpu.in/thousands-of-students-across-the-world-started-their-new-journey-with-enthusiasm-at-lpu/"))
        list.add(Model("Thousands of students across the world started their new journey with enthusiasm at LPU", "", R.drawable.lpumam, "https://happenings.lpu.in/thousands-of-students-across-the-world-started-their-new-journey-with-enthusiasm-at-lpu/"))
        list.add(Model("LPU strikes deals with Google, SAP, Oracle etc to offer free industry training to students!", "", R.drawable.amalpu, "https://www.lpu.in/latest-news.php"))




        listView.adapter = Myarrayadapter(requireContext(), R.layout.listviewrow, list)

        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position: Int, id: Long ->
            val selectedModel = list[position]
            Toast.makeText(requireContext(), selectedModel.title, Toast.LENGTH_SHORT).show()
        }
    }
}
