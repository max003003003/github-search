package com.example.githubsearch


import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.githubsearch.model.GithubResponseBase
import com.example.githubsearch.retrofit.GitHubServiceBuilder
import kotlinx.coroutines.*
import retrofit2.HttpException


class Repository {
    fun getRepo(name: String): MutableLiveData<Resource<GithubResponseBase>> {
        val mutableLiveData = MutableLiveData<Resource<GithubResponseBase>>()
        mutableLiveData.value = Resource.Loading()
        val req = GitHubServiceBuilder().getGithubRepository();

             val coroutineScope = CoroutineScope(Dispatchers.Main)
             val exceptionHandler = CoroutineExceptionHandler { coroutineContext, throwable ->
                 Log.e("retrofit", throwable.toString())
                if (throwable is HttpException) {
                    mutableLiveData.value = Resource.Error(throwable.toString())
                } else {

                }
            }

            coroutineScope.launch(exceptionHandler) {
                val response = withContext(Dispatchers.IO) {
                    req.getRepositoryByName("docker+in:name")
                }

                mutableLiveData.value = Resource.Success(response)
            }
       return mutableLiveData
    }
}

