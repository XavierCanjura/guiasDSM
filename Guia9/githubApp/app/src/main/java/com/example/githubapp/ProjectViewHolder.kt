package com.example.githubapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.githubapp.databinding.ItemUserBinding

class ProjectViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
    private val itemUserBinding: ItemUserBinding

    init {
        itemUserBinding = ItemUserBinding.bind(view!!)
    }

    fun bind(projectname: String?){
        itemUserBinding.projectName.setText(projectname)
    }
}