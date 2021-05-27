package com.example.colorswitch

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Toast
import com.example.colorswitch.utils.MyData
import com.example.colorswitch.utils.MySharedPreference
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MySharedPreference.init(this)

        btn_clickme.setOnClickListener {
            startActivity(Intent(this, ColorActivity::class.java))
        }
    }

    override fun onStart() {
        super.onStart()

        MySharedPreference.init(this)

        if (MySharedPreference.animation == 1) {
            val alphaAnimation = AnimationUtils.loadAnimation(this, R.anim.alpha)
            txt_animation.startAnimation(alphaAnimation)
            alphaAnimation.setAnimationListener(object : Animation.AnimationListener {
                override fun onAnimationStart(animation: Animation?) {

                }

                override fun onAnimationEnd(animation: Animation?) {
                    MySharedPreference.init(this@MainActivity)
                    if (MySharedPreference.animation == 1) {
                        txt_animation.startAnimation(animation)
                    }
                }

                override fun onAnimationRepeat(animation: Animation?) {

                }
            })

        }


        if (MySharedPreference.animation == 2) {
            val scaleanimation = AnimationUtils.loadAnimation(this, R.anim.scale)
            txt_animation.startAnimation(scaleanimation)
            scaleanimation.setAnimationListener(object : Animation.AnimationListener {
                override fun onAnimationStart(animation: Animation?) {

                }

                override fun onAnimationEnd(animation: Animation?) {
                    MySharedPreference.init(this@MainActivity)
                    if (MySharedPreference.animation == 2) {
                        txt_animation.startAnimation(animation)
                    }
                }

                override fun onAnimationRepeat(animation: Animation?) {

                }
            })

        }

        if (MySharedPreference.animation == 3) {
            val translateanimation = AnimationUtils.loadAnimation(this, R.anim.translate)
            txt_animation.startAnimation(translateanimation)
            translateanimation.setAnimationListener(object : Animation.AnimationListener {
                override fun onAnimationStart(animation: Animation?) {

                }

                override fun onAnimationEnd(animation: Animation?) {
                    MySharedPreference.init(this@MainActivity)
                    if (MySharedPreference.animation == 3) {
                        txt_animation.startAnimation(animation)
                    }
                }

                override fun onAnimationRepeat(animation: Animation?) {

                }
            })

        }

        if (MySharedPreference.animation == 4) {
            val rotateanimation = AnimationUtils.loadAnimation(this, R.anim.rotate)
            txt_animation.startAnimation(rotateanimation)
            rotateanimation.setAnimationListener(object : Animation.AnimationListener {
                override fun onAnimationStart(animation: Animation?) {

                }

                override fun onAnimationEnd(animation: Animation?) {
                    MySharedPreference.init(this@MainActivity)
                    if (MySharedPreference.animation == 4) {
                        txt_animation.startAnimation(animation)
                    }
                }

                override fun onAnimationRepeat(animation: Animation?) {

                }
            })

        }

        if (MySharedPreference.animation == 5) {
            val scaleanimation = AnimationUtils.loadAnimation(this, R.anim.scale)
            txt_animation.startAnimation(scaleanimation)
            scaleanimation.setAnimationListener(object : Animation.AnimationListener {
                override fun onAnimationStart(animation: Animation?) {

                }

                override fun onAnimationEnd(animation: Animation?) {
                    MySharedPreference.init(this@MainActivity)
                    if (MySharedPreference.animation == 5) {
                        txt_animation.startAnimation(animation)
                    }
                }

                override fun onAnimationRepeat(animation: Animation?) {

                }
            })

        }
    }


}