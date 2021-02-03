package com.example.githubsearch.httpclient

import okhttp3.OkHttpClient

interface IHttpClient {

    fun getHttpClient(): OkHttpClient
}

