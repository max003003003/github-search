package com.example.githubsearch.retrofit

import com.example.githubsearch.model.GithubResponseBase
import retrofit2.http.GET
import retrofit2.http.Query

interface IGithubService {
    @GET("search/repositories")
    suspend fun getRepositoryByName(
        @Query("q", encoded = true) githubSearchQuery: String): GithubResponseBase
}
