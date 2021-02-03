package com.example.githubsearch


import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.githubsearch.viewmodel.GithubViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {


    private val githubViewModel: GithubViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.main_activity_layout)
        val tv = findViewById<TextView>(R.id.hello_tv)
        githubViewModel.githubLiveData.observe (this, {
            val format = Json { prettyPrint = true }

           when(it.data){
               null -> tv.text = getString(R.string.LoadingMessage)
               else -> tv.text = format.encodeToString(
                   it.data)

           }

        })
        findViewById<Button>(R.id.search_button).setOnClickListener{
            githubViewModel.getRepo()
        }
    }
}
