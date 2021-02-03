package com.example.githubsearch

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.githubsearch.model.GithubResponseBase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class GithubViewModel @Inject constructor(

) : ViewModel()  {
    val api: Repository = Repository()
    val githubRepository: MutableLiveData<Resource<GithubResponseBase>> = api.getRepo("");


    public fun getRepo() {

        api.getRepo("somethings");
    }
}
