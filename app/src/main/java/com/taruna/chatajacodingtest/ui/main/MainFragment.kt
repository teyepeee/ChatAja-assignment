package com.taruna.chatajacodingtest.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.taruna.chatajacodingtest.R
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private val dataAdapter by lazy { DataAdapter() }
    private val dataList = mutableListOf<String>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = dataAdapter
        }

        dataAdapter.setData(getData())
    }

    private fun getData(): List<String> {
        var x = ""
        for (data in 0 until 200) {
            x = "Data $data"
            dataList.add(x)
        }
        return dataList
    }
}