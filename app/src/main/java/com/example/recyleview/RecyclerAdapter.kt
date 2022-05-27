package com.example.recyleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    private val list = arrayOf(
        "Alpha",
        "Bravo",
        "Charlie",
        "Delta",
        "Foxtrot",
        "Golf",
        "Hotel",
        "India",
        "Juliet",
    )
//    private val imgList = arrayOf(
//
//    )
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val inflate = LayoutInflater.from(parent.context).inflate(R.layout.list,parent,false)
        return ViewHolder(inflate)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemText.text = list[position]

    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder (itemView : View): RecyclerView.ViewHolder(itemView){
        val itemText : TextView

        init {
            itemText = itemView.findViewById<TextView>(R.id.lbList)


            itemView.setOnClickListener(){
                val position = adapterPosition

                Toast.makeText(itemView.context,"Kamu mengklik di ${list[position]}",Toast.LENGTH_LONG).show()
            }
        }
    }

}