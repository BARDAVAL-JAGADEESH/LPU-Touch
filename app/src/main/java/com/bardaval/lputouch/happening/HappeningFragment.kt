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

        list.add(Model("If Employment Bears Hallmarks\n of Regular GovtServices.", "Bardaval", R.drawable.logolpu, "https://www.news18.com/news/"))
        list.add(Model("Live", "Lpu Live", R.drawable.logolpu, "https://www.news18.com/news/"))
        list.add(Model("Touch", "Lpu Touch", R.drawable.logolpu, "https://www.news18.com/"))
        list.add(Model("Linkedin", "Linkedin", R.drawable.logolpu, "https://www.news18.com/"))
        list.add(Model("Insta", "Instagram", R.drawable.logolpu, "https://www.news18.com/"))
        list.add(Model("Facebook", "Facebook", R.drawable.logolpu, "https://www.news18.com/"))
        list.add(Model("Twitter", "Twitter", R.drawable.logolpu, "https://www.news18.com/"))
        list.add(Model("Github", "Bardaval", R.drawable.logolpu, "https://www.news18.com/"))
        list.add(Model("Live", "Lpu Live", R.drawable.logolpu, "https://www.news18.com/"))
        list.add(Model("Touch", "Lpu Touch", R.drawable.logolpu, "https://www.news18.com/"))

        list.add(Model("Facebook", "Facebook", R.drawable.logolpu, "https://www.news18.com/"))
        list.add(Model("Twitter", "Twitter", R.drawable.logolpu, "https://www.news18.com/"))

        listView.adapter = Myarrayadapter(requireContext(), R.layout.listviewrow, list)

        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position: Int, id: Long ->
            val selectedModel = list[position]
            Toast.makeText(requireContext(), selectedModel.title, Toast.LENGTH_SHORT).show()
        }
    }
}
