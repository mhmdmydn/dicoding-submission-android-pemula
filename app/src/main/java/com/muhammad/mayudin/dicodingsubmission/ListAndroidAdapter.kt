package com.muhammad.mayudin.dicodingsubmission

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import de.hdodenhof.circleimageview.CircleImageView

class ListAndroidAdapter(private val listAndroid: ArrayList<Android>) : RecyclerView.Adapter<ListAndroidAdapter.AndroidViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback


    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AndroidViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_row_android, parent, false)
        return AndroidViewHolder(view)
    }

    override fun onBindViewHolder(holder: AndroidViewHolder, position: Int) {
        val android = listAndroid[position]

        Glide.with(holder.itemView.context)
            .load(android.photo)
            .apply(RequestOptions())
            .into(holder.imgPhoto)
        val text = "${android.name} (API ${android.api})"
        holder.tvName.text = text
        holder.tvDetail.text = android.feature

        holder.itemView.rootView.setOnClickListener {
            onItemClickCallback.onItemClicked(android)
        }
    }

    override fun getItemCount(): Int {
        return listAndroid.size
    }

    inner class AndroidViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imgPhoto: CircleImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        val tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Android)
    }
}