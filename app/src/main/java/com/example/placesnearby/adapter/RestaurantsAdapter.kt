package com.example.placesnearby.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.placesnearby.activity.MapsActivity
import com.example.placesnearby.databinding.RestaurantsItemBinding
import com.example.placesnearby.model.RestaurantsModel

class RestaurantsAdapter(val context: Context, val list: List<RestaurantsModel.Result>)
    :RecyclerView.Adapter<RestaurantsAdapter.ViewHolder>(){


    private var onClickListener: OnClickListener? = null


    class ViewHolder(val binding: RestaurantsItemBinding):RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantsAdapter.ViewHolder {
        return ViewHolder(RestaurantsItemBinding.inflate(LayoutInflater.from(context),parent,false))
    }

    override fun onBindViewHolder(holder: RestaurantsAdapter.ViewHolder, position: Int) {
        holder.binding.item=list[position]

        holder.binding.ratingBar.rating=list[position].rating.toFloat()

        holder.itemView.setOnClickListener {
            val intent=Intent(context, MapsActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            context.startActivity(intent)

        }

    }

    override fun getItemCount(): Int {
        return list.size
    }

    interface OnClickListener{
        fun onClick(position: Int)
    }
}