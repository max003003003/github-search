package com.example.githubsearch.retrofit


import com.example.githubsearch.httpclient.IHttpClient
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import retrofit2.Retrofit
import javax.inject.Inject


class GitHubServiceBuilder @Inject constructor(
    val okHttpClient: IHttpClient ,
    val baseUrl: String
){


    fun getGithubService(): IGithubService {
        val contentType = MediaType.parse("application/json")!!
        val retrofit = Retrofit.Builder()
            .client(okHttpClient.getHttpClient() )
            .baseUrl(baseUrl)
            .addConverterFactory(Json.asConverterFactory(contentType))
            .build()
        return retrofit.create(IGithubService::class.java)

    }

}
