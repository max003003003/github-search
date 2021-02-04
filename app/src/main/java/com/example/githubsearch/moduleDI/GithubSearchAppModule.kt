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
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Qualifier
import javax.inject.Singleton


@Module
@InstallIn(
    SingletonComponent::class)
 object GithubSearchAppModule {


    @DefaultDispatcher
    @Provides
    fun providesDefaultDispatcher(): CoroutineDispatcher = Dispatchers.Default

    @IoDispatcher
    @Provides
    fun providesIoDispatcher(): CoroutineDispatcher = Dispatchers.IO

    @MainDispatcher
    @Provides
    fun providesMainDispatcher(): CoroutineDispatcher = Dispatchers.Main

    @Retention(AnnotationRetention.BINARY)
    @Qualifier
    annotation class DefaultDispatcher

    @Retention(AnnotationRetention.BINARY)
    @Qualifier
    annotation class IoDispatcher

    @Retention(AnnotationRetention.BINARY)
    @Qualifier
    annotation class MainDispatcher


    @Singleton
    @Provides
    fun provideGithubRepo(): IGithubRepository = GithubRepository(provideGithubService())


    @Singleton
    @Provides
    fun provideHttpClient(): IHttpClient = OkHttpClient()


   @Singleton
   @Provides
   fun provideDefaultDispatcher(): CoroutineDispatcher = Dispatchers.IO


    @Singleton
    @Provides
    fun provideGithubService(): IGithubService =  GitHubServiceBuilder(provideHttpClient(), provideBaseUrl()).getGithubService();

    @Singleton
    @Provides
    fun provideBaseUrl(): String =  "https://api.github.com/";

}
