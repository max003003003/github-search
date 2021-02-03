package com.example.githubsearch.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.githubsearch.model.GithubResponseBase
import com.example.githubsearch.repository.IGithubRepository
import com.example.githubsearch.retrofit.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.*
import retrofit2.HttpException
import javax.inject.Inject

@HiltViewModel
class GithubViewModel @Inject constructor(
    val githubRepo: IGithubRepository,
) : ViewModel() {

    val githubLiveData: MutableLiveData<Resource<GithubResponseBase>> = MutableLiveData()

    fun getRepo(name: String = "docker") {
        githubLiveData.postValue(Resource.Loading())
        val coroutineScope = CoroutineScope(Dispatchers.Main)
        val exceptionHandler = CoroutineExceptionHandler { coroutineContext, throwable ->
            Log.e("retrofit", throwable.toString())
            if (throwable is HttpException) {
                githubLiveData.value = Resource.Error(throwable.toString())
            } else {

            }
        }
        coroutineScope.launch(exceptionHandler) {


            withContext(Dispatchers.IO) {
                val response = githubRepo.getRepo(name)

                githubLiveData.postValue(Resource.Success<GithubResponseBase>(response))
            }

        }
    }
}
