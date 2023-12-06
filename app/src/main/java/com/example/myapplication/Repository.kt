package com.example.myapplication

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.myapplication.remote.DadJokesApi
import com.example.myapplication.remote.DadJokesModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class Repository @Inject constructor(private val api: DadJokesApi) {

    fun getJoke(): MutableLiveData<DadJokesModel> {

        val list = MutableLiveData<DadJokesModel>()

         api.getJoke().enqueue(object : Callback<DadJokesModel> {
            override fun onResponse(
                call: Call<DadJokesModel>,
                response: Response<DadJokesModel>
            ) {
                if (response.isSuccessful){
                    response.body()?.let {
                        list.postValue(it)
                    }
                }
            }

            override fun onFailure(call: Call<DadJokesModel>, t: Throwable) {
                Log.e("lalala", "onFailure: ${t.message}")
            }

        })
        return list
    }
}