package com.example.githubsearch

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.test.espresso.matcher.ViewMatchers.assertThat
import com.example.githubsearch.model.GithubResponseBase
import com.example.githubsearch.repository.IGithubRepository
import com.example.githubsearch.retrofit.Resource
import com.example.githubsearch.viewmodel.GithubViewModel
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.test.TestCoroutineDispatcher
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.instanceOf
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner


@RunWith(MockitoJUnitRunner::class)
class  GithubViewModelTest {
    @get:Rule
    val rule = InstantTaskExecutorRule()

    val testDispatcher = TestCoroutineDispatcher()

    @Before
    fun setup() {
    }

    @After
    fun tearDown() {
    }


    @Test
    fun shouldGetGithubRepoAndPutStateToLiveData()  {
        val mockResponse = GithubResponseBase(0, null, null)
        val mockGithubRepository = mockk<IGithubRepository>()
        coEvery {
            mockGithubRepository.getRepo(any())
        } returns mockResponse

        val githubViewModelUnderTest = GithubViewModel(mockGithubRepository, testDispatcher)
        githubViewModelUnderTest.getRepo("docker")
        assertThat( githubViewModelUnderTest.githubLiveData.value, `is` (instanceOf(Resource.Success::class.java)))
    }


}
