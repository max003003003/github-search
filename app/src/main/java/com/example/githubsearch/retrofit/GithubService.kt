package com.example.githubsearch.retrofit

import androidx.lifecycle.LiveData
import com.example.githubsearch.model.GithubResponseBase
import retrofit2.http.GET
import retrofit2.http.Query

interface GithubService {
    @GET("search/repositories")
    suspend fun getRepositoryByName(
        @Query("q", encoded = true) githubSearchQuery: String): GithubResponseBase
}
