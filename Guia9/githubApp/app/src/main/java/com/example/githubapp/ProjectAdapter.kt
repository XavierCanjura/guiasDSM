package com.example.githubapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ProjectAdapter(private val projectname: List<String>?): RecyclerView.Adapter<ProjectViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_user, parent, false)
        return ProjectViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProjectViewHolder, position: Int) {
        holder.bind(projectname!![position])
    }

    override fun getItemCount(): Int {
        return projectname?.size ?: 0
    }
}