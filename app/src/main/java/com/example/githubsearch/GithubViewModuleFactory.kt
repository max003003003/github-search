package com.example.githubsearch

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

interface GithubViewModelFactory : ViewModelProvider.Factory

@Suppress("UNCHECKED_CAST")
class GithubViewModuleFactoryImpl () : GithubViewModelFactory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return GithubViewModel() as T
    }
}
