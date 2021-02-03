package com.example.githubsearch


import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {


    private val githubViewModel: GithubViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity_layout)
        val tv = findViewById<TextView>(R.id.hello_tv)
        githubViewModel.githubRepository.observe(this, {

            tv.text = it.data.toString()

        })
        findViewById<Button>(R.id.search_button).setOnClickListener{
            View ->
            githubViewModel.getRepo()
            Log.d("click","click")
        }
    }
}
