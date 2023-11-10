package com.unitech.zekshoppingmall.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.ActionBar
import com.unitech.zekshoppingmall.R

class GreetingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)


        val actionBar : ActionBar? = supportActionBar
        actionBar?.hide()

        val imageView = findViewById<ImageView>(R.id.imageView1)
        val ani : Animation = AnimationUtils.loadAnimation(
            this@GreetingActivity,R.anim.forward_animation
        )
        imageView.animation = ani
        try {
            Handler().postDelayed(
                {
                    startActivity(
                        Intent(
                        this@GreetingActivity, SliderActivity::class.java)
                    )
                    finish()
                },3000
            )
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
}