package com.example.githubapp.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class UserResponse {
    @SerializedName("items")
    @Expose
    private var userData: List<UserModel?>? = null

    fun setUserData(userData: List<UserModel?>?){
        this.userData = userData
    }

    fun getUserData(): List<UserModel?>?{
        return this.userData
    }
}