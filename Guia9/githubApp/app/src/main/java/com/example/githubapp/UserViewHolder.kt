package com.example.githubapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.githubapp.databinding.ItemUserBinding
import com.squareup.picasso.Picasso

class UserViewHolder(view: View): RecyclerView.ViewHolder(view!!) {
    private val itemUserBinding: ItemUserBinding

    init {
        itemUserBinding = ItemUserBinding.bind(view!!)
    }

    fun bind(imageUrl: String?, username: String?, projectname: String?){
        // itemUserBinding.userName.setText(username)
    }
}