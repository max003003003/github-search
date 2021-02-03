package com.example.githubsearch.repository

import com.example.githubsearch.model.GithubResponseBase

interface IGithubRepository {
    suspend fun getRepo(name: String): GithubResponseBase
}
