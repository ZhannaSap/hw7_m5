package com.example.myapplication.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//https://dad-jokes.p.rapidapi.com/random/joke

object RetrofitService {
    val retrofit = Retrofit.Builder().baseUrl("https://dad-jokes.p.rapidapi.com/")
        .addConverterFactory(GsonConverterFactory.create()).build()

    val api = retrofit.create(DadJokesApi::class.java)
}