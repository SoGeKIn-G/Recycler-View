package com.gauravbora.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val songs:List<Songs>): RecyclerView.Adapter<MyAdapter.MyViewHoder>() {

//    creates view holder in which we stores views
//    layout inflater converts layout xml file to java code

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHoder {
      val inflater=LayoutInflater.from(parent.context)
        val view=inflater.inflate(R.layout.item_view,parent,false)
        return MyViewHoder(view)
    }

    override fun onBindViewHolder(holder: MyViewHoder, position: Int) {
        holder.title.text=songs[position].title
        holder.discription.text=songs[position].description
    }

    override fun getItemCount(): Int {
return songs.size
    }
    class MyViewHoder(itemView: View):RecyclerView.ViewHolder(itemView) {

        val title=itemView.findViewById<TextView>(R.id.tittle)
        val discription=itemView.findViewById<TextView>(R.id.description)

    }
}

