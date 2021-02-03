package com.example.githubsearch.moduleDI

import com.example.githubsearch.httpclient.IHttpClient
import com.example.githubsearch.httpclient.OkHttpClient
import com.example.githubsearch.repository.GithubRepository
import com.example.githubsearch.repository.IGithubRepository
import com.example.githubsearch.retrofit.GitHubServiceBuilder
import com.example.githubsearch.retrofit.IGithubService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(
    SingletonComponent::class)
 object GithubSearchAppModule {

    @Singleton
    @Provides
    fun provideGithubRepo(): IGithubRepository = GithubRepository(provideGithubService())


    @Singleton
    @Provides
    fun provideHttpClient(): IHttpClient = OkHttpClient()


    @Singleton
    @Provides
    fun provideGithubService(): IGithubService =  GitHubServiceBuilder(provideHttpClient(), provideBaseUrl()).getGithubService();

    @Singleton
    @Provides
    fun provideBaseUrl(): String =  "https://api.github.com/";

}
