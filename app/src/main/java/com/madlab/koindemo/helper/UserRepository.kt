package com.madlab.koindemo.helper

import com.madlab.koindemo.interfaces.GithubApi

class UserRepository(private val api: GithubApi) {
    fun getAllUsers() = api.getUser()
}