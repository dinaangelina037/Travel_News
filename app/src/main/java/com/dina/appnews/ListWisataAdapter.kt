package com.dina.appnews

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dina.appnews.databinding.ItemCardWisataBinding

class ListWisataAdapter (private val ListWisata: ArrayList<Wisata>):RecyclerView.Adapter<ListWisataAdapter.ListViewHolder>() {
   inner class ListViewHolder (var binding: ItemCardWisataBinding): RecyclerView.ViewHolder(binding.root) {
       fun bind(wisata: Wisata){
           with(binding){
               Glide.with(binding.ivProfil.context)
                   .load(wisata.photo)
                   .apply(RequestOptions().override(60,60))
                   .into(binding.ivProfil)

               binding.tvItemName.text = wisata.name
               binding.tvItemDeskripsi.text = wisata.deskripsi


               itemView.setOnClickListener {
                   Toast.makeText(itemView.context,
                       "Kamu memilih" + ListWisata[adapterPosition].name,
                       Toast.LENGTH_SHORT).show()
                    }
                }
           }
       }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val binding = ItemCardWisataBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(ListWisata[position])
    }

    override fun getItemCount(): Int =
       ListWisata.size

}


