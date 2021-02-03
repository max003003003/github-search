package com.example.githubsearch.retrofit


import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit


class GitHubServiceBuilder {


    fun getGithubRepository(): GithubService {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BASIC

        val client = OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()

        val contentType = MediaType.parse("application/json")!!
        val retrofit = Retrofit.Builder()
            .client(client)
            .baseUrl("https://api.github.com/")
            .addConverterFactory(Json.asConverterFactory(contentType))
            .build()
        return retrofit.create(GithubService::class.java)

    }

}
