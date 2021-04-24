package com.zaerina.uts_18090095.activity._main

import androidx.appcompat.app.AppCompatActivity
import com.zaerina.uts_18090095.R
import com.zaerina.uts_18090095.activity.login.LoginActivity
import android.content.Intent
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_splashscreen)
            Handler().postDelayed({
                startActivity(Intent(this, LoginActivity::class.java))
            }, 1000)
        }
    }
