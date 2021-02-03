package com.example.githubsearch.repository


import com.example.githubsearch.model.GithubResponseBase
import com.example.githubsearch.retrofit.IGithubService
import javax.inject.Inject


class GithubRepository  @Inject constructor(
val githubService: IGithubService
) : IGithubRepository{

    override suspend fun getRepo(name: String): GithubResponseBase {
        return  githubService.getRepositoryByName("$name+in:name");
    }
}

