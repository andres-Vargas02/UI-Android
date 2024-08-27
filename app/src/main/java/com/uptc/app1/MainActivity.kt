package com.uptc.app1

import android.os.Bundle
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var llPosts: LinearLayout
    private val postList = arrayListOf<Post>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        fillPostList()
        addPostsToLL()
        }

    private fun addPostsToLL() {
        postList.forEach { post ->
            val postView = layoutInflater.inflate(R.layout.home_post, llPosts, false)

            postView.findViewById<TextView>(R.id.tvUsername).text = post.userName

            postView.apply {
                findViewById<ImageButton>(R.id.ibDialogue).setOnClickListener {
                    showToast("responder")
                }
                findViewById<ImageButton>(R.id.ibRT).setOnClickListener {
                    showToast("retwitt", Toast.LENGTH_LONG)
                }
                findViewById<ImageButton>(R.id.ibHeart).setOnClickListener {
                    showToast("Me gusta", Toast.LENGTH_LONG)
                }
                findViewById<ImageButton>(R.id.ibFavoritr).setOnClickListener {
                    showToast("Favorito", Toast.LENGTH_LONG)
                }
                findViewById<ImageButton>(R.id.ibShare).setOnClickListener {
                    showToast("Compartir", Toast.LENGTH_LONG)
                }
            }

            llPosts.addView(postView)
        }
    }


    private fun fillPostList() {
        for (i in 0 until 10) {
            postList.add(Post("Usuario 71$i      @US687$i"))
        }
    }

    private fun initViews() {
        llPosts = findViewById(R.id.ll_posts)
    }
}
