package com.example.githubapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class UserAdapter(private val image: String?, private val username: String?): RecyclerView.Adapter<UserViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_main, parent, false)
        return  UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        // holder.bind(image, username)
    }

    override fun getItemCount(): Int {
        return  0
    }
}