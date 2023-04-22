package com.example.githubapp.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Client {
    public val BASE_URL: String = "https://api.github.com"
    public var retrofit: Retrofit? = null

    fun getClient(): Retrofit? {
        if(retrofit == null){
           this.retrofit = Retrofit.Builder()
               .baseUrl(this.BASE_URL)
               .addConverterFactory(GsonConverterFactory.create())
               .build()
        }

        return retrofit
    }
}