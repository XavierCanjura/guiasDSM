package com.example.retrofitapp

import com.google.gson.annotations.SerializedName

class DogsResponse {
    @SerializedName("status")
    private var status: String? = null

    @SerializedName("message")
    private var images: List<String?>? = null

    fun getStatus(): String?{
        return status
    }

    fun setStatus(status: String?){
        this.status = status
    }

    fun getImages(): List<String?>?{
        return images
    }

    fun setStatus(images: List<String?>?){
        this.images = images
    }
}