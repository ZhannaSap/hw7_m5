package com.example.myapplication.di

import com.example.myapplication.remote.DadJokesApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@InstallIn(SingletonComponent::class)
@Module
class AppModule {

    @Provides
    fun provideApi(): DadJokesApi {
        return Retrofit.Builder().baseUrl("https://dad-jokes.p.rapidapi.com/")
            .addConverterFactory(GsonConverterFactory.create()).build().create(DadJokesApi::class.java)
    }
}