package com.cemalcansanaral.basketballproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.databinding.DataBindingUtil
import com.cemalcansanaral.basketballproject.databinding.ActivitySplashScreenBinding
import java.lang.Exception

class SplashScreen : AppCompatActivity() {

    private lateinit var design : ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        design = DataBindingUtil.setContentView(this,R.layout.activity_splash_screen)

        val splashGifAnimation = AnimationUtils.loadAnimation(this,R.anim.splash_image_animation)
        val splashTextAnimation = AnimationUtils.loadAnimation(this,R.anim.splash_progress_animation)
        val splashProgressAnimation = AnimationUtils.loadAnimation(this,R.anim.splash_progress_animation)

        design.gifImageView.startAnimation(splashGifAnimation)
        design.textViewSplashScreen.startAnimation(splashTextAnimation)
        design.progressBar.startAnimation(splashProgressAnimation)

        SplashScreenAnimationThread()
    }

    fun SplashScreenAnimationThread() {
        //Splash Screen ekranı için bir Thread oluşturuyoruz.
        val background = object : Thread() {
            override fun run() {
                try {
                    //thread 5sn yani 5000ms uyusun
                    Thread.sleep(5000)
                    //intent ile splash ekranından sonra MainActivity ekranı açılsın diyoruz.
                    val intent = Intent(baseContext, MainActivity::class.java)
                    startActivity(intent)
                } catch (e : Exception) {
                    e.printStackTrace()
                }
            }
        }
        background.start()
    }
}