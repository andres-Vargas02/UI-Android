package com.uptc.app1.rv_activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.uptc.app1.rv_activity.adapters.RVAdapterPosts
import com.uptc.app1.R
import com.uptc.app1.data.Post


class RecyclerViewActivity : AppCompatActivity() {

    private lateinit var rvPosts: RecyclerView
    private val postList = arrayListOf<Post>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        fillPostList()
        initViews()
    }

    private fun initViews() {
        rvPosts = findViewById(R.id.rv_posts)
        rvPosts.apply {
            layoutManager = LinearLayoutManager(this@RecyclerViewActivity, LinearLayoutManager.VERTICAL, false)
            adapter = RVAdapterPosts(postList)
        }
    }

    private fun fillPostList() {
        for (i in 0 until 10) {
            postList.add(Post("Username $i"))
        }
    }
}