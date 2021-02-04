package com.example.githubsearch.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.githubsearch.model.GithubResponseBase
import com.example.githubsearch.moduleDI.GithubSearchAppModule
import com.example.githubsearch.repository.IGithubRepository
import com.example.githubsearch.retrofit.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.*
import javax.inject.Inject

@HiltViewModel
class GithubViewModel @Inject constructor(
    val githubRepo: IGithubRepository,
    @GithubSearchAppModule.IoDispatcher val defaultDispatcher: CoroutineDispatcher
) : ViewModel() {

    val githubLiveData: MutableLiveData<Resource<GithubResponseBase>> = MutableLiveData()

    fun getRepo(name: String = "docker") {
        viewModelScope.launch(defaultDispatcher) {
            withContext(defaultDispatcher) {
                githubLiveData.postValue(Resource.Loading())
                val response = githubRepo.getRepo(name)
                githubLiveData.postValue(Resource.Success<GithubResponseBase>(response))
            }

        }
    }
}
