package com.example.githubsearch.httpclient

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor

class OkHttpClient: IHttpClient {
    override fun getHttpClient(): OkHttpClient {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BASIC

       return OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()
    }
}
