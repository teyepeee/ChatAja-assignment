package com.taruna.chatajacodingtest.ui.main

import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.taruna.chatajacodingtest.R
import kotlinx.android.synthetic.main.item_data.view.*

class DataAdapter : RecyclerView.Adapter<DataAdapter.DataViewHOlder>() {

    private var data: List<String> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHOlder {
        return DataViewHOlder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_data, parent, false)
        )
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: DataViewHOlder, position: Int) =
        holder.bind(data[position])

    override fun onBindViewHolder(
        holder: DataViewHOlder,
        position: Int,
        payloads: MutableList<Any>
    ) {
        Log.d("PAYLOAD", "onBindViewHolder: $payloads")
        if (payloads.isNotEmpty()) {
            if (payloads[0] is String) {
                holder.itemView.setBackgroundColor(Color.parseColor(payloads[0] as String))
            }
        }
        super.onBindViewHolder(holder, position, payloads)
    }

    fun setData(data: List<String>) {
        this.data = data
        notifyDataSetChanged()
    }

    class DataViewHOlder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: String) = with(itemView) {
            if (absoluteAdapterPosition == 50) {
                setBackgroundColor(Color.parseColor("#FF0000"))
            } else {
                setBackgroundColor(Color.parseColor("#FFFFFF"))
            }
            textData.text = item
        }
    }
}