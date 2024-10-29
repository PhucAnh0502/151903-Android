package com.example.gmaillist
import android.icu.text.Transliterator.Position
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import androidx.recyclerview.widget.RecyclerView
import com.example.gmaillist.databinding.ItemGmailBinding

class GmailAdapter (private val gmailList: List<Gmail>) : RecyclerView.Adapter<GmailAdapter.GmailViewHolder>(){
    inner class GmailViewHolder(private val binding: ItemGmailBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(gmail: Gmail){
            binding.tvSender.text = gmail.sender
            binding.tvTitle.text = gmail.title
            binding.tvContent.text = gmail.content
            binding.tvTime.text = gmail.time
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GmailViewHolder{
            val binding = ItemGmailBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return GmailViewHolder(binding)
        }

        override fun onBindViewHolder(holder: GmailViewHolder, position: Int){
            holder.bind(gmailList[position])
        }

        override fun getItemCount(): Int = gmailList.size
    }

}
