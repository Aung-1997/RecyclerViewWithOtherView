package com.myanmaritc.myrecview.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.recyclerview.widget.RecyclerView
import com.myanmaritc.myrecview.R
import com.myanmaritc.myrecview.data.Information
import kotlinx.android.synthetic.main.info_grid.view.*

class InfoAdapter(var infolist :ArrayList<Information>): RecyclerView.Adapter<InfoAdapter.InfoViewHolder>(){

    class InfoViewHolder( itemView: View):RecyclerView.ViewHolder(itemView){
        fun bind(info :Information){

            itemView.infoName.text=info.name
            itemView.infoImage.setImageResource(info.image)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InfoViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.info_grid,parent,false)
        return InfoViewHolder(view)
    }

    override fun getItemCount(): Int =infolist.size

    override fun onBindViewHolder(holder: InfoViewHolder, position: Int) {
        holder.bind(infolist[position])
    }

}