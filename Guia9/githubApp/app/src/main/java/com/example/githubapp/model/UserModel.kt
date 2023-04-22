package com.example.githubapp.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class UserModel {
    @SerializedName("login")
    @Expose
    private var username: String? = null

    @SerializedName("avatar")
    @Expose
    private var avatar: String? = null

    fun setUserName(username: String?){
        this.username = username
    }

    fun getUserName(): String?{
        return this.username
    }

    fun setAvatar(avatar: String?){
        this.avatar = avatar
    }

    fun getAvatar(): String?{
        return this.avatar
    }
}