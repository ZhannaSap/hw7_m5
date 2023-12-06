package com.example.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.remote.DadJokesModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class JokeViewModel @Inject constructor(private val repository: Repository) : ViewModel() {

    fun getLiveJokeData(): LiveData<DadJokesModel> {
        return repository.getJoke()
    }
}