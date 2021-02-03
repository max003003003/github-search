package com.example.githubsearch

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent


@Module
@InstallIn(ActivityComponent::class)
class ActivityModule {

    @Provides
    fun provideGithubViewModelFactory(): GithubViewModelFactory =
        GithubViewModuleFactoryImpl()
}
