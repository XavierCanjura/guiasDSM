package com.example.githubapp.api


import com.example.githubapp.model.ProjectResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

//Endpoints
interface Service {
    @GET("/users/{user}/repos")
    fun getRepoByName(@Path("user") user: String?): Call<ProjectResponse?>?

    @GET("/search/users?q=user:{user}")
    fun getInfomationByName(@Path("user") user: String?): Call<Any?>?
}

//https://api.github.com/search/repositories?q=user:XavierCanjura+is:public