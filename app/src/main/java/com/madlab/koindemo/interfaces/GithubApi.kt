package com.madlab.koindemo.interfaces

import com.madlab.koindemo.model.GithubUser
import retrofit2.Call
import retrofit2.http.GET

interface GithubApi {
    @GET("users")
    fun getUser(): Call<List<GithubUser>>
}