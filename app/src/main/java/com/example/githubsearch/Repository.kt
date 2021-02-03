package com.example.githubsearch


import com.example.githubsearch.model.GithubResponseBase
import com.example.githubsearch.retrofit.GitHubServiceBuilder


class Repository {
    suspend fun getRepo(name: String): GithubResponseBase {

        val req = GitHubServiceBuilder().getGithubRepository();
        return  req.getRepositoryByName("$name+in:name");
    }
}

