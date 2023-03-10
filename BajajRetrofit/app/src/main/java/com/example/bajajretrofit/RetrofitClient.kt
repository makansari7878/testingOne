package com.example.bajajretrofit

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET


interface ApiInterface{
    @GET("photos")
    fun getUsers(): Call<List<Users>>
}


class RetrofitClient {
    companion object{
        var myRetrofit =  Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            . addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiInterface::class.java)
    }
}