package com.onepiece.strawhatpirate.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.onepiece.strawhatpirate.model.Character
import com.onepiece.strawhatpirate.R

class ListCharacterAdapter(private val listCharacter: ArrayList<Character>) :
    RecyclerView.Adapter<ListCharacterAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_character,
            parent,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val hero = listCharacter[position]

        Glide.with(holder.itemView.context)
            .load(hero.photo)
            .apply(RequestOptions().override(55,55))
            .into(holder.imgPhoto)

        holder.tvName.text = hero.name
        holder.tvDetail.text = hero.detail
        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(hero)
        }
    }

    override fun getItemCount(): Int {
        return listCharacter.size
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}