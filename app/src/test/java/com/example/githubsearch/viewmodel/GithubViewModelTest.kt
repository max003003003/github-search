package com.example.githubsearch.viewmodel

import android.os.Build
import androidx.test.espresso.matcher.ViewMatchers.assertThat
import com.example.githubsearch.model.GithubResponseBase
import com.example.githubsearch.repository.GithubRepository
import com.example.githubsearch.retrofit.IGithubService
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.test.runBlockingTest
import org.hamcrest.CoreMatchers.`is`
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner
import org.robolectric.annotation.Config

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(MockitoJUnitRunner::class)
class GithubViewModelTest {

    @Before
    fun setup() {
    }

    @Test
    fun shouldGetGithubService() = runBlockingTest {

        val githubServiceMock = mockk<IGithubService>()
        coEvery {
            githubServiceMock.getRepositoryByName(any())
        } returns GithubResponseBase(0, null, null)

        val githubRepo = GithubRepository(githubServiceMock)

        val resp =  githubRepo.getRepo("docker")

        coVerify {

            githubServiceMock.getRepositoryByName("docker+in:name")
        }
        assertThat(resp , `is`(GithubResponseBase(0, null, null)))
    }


}
