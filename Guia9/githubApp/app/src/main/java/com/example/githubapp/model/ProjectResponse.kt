package com.example.githubapp.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ProjectResponse {
    @SerializedName("name")
    @Expose
    private var projectName: List<String?>? = null

    fun setItems(projectName: List<String?>?) {
        this.projectName = projectName
    }

    fun getItems(): List<String?>? {
        return this.projectName
    }
}