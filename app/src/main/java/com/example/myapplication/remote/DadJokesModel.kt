package com.example.myapplication.remote

data class DadJokesModel(
    val body: List<JokesModel>
)

data class JokesModel(
    val setup: String,
    val punchline:String
)