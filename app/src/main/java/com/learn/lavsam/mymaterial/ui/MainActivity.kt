package com.learn.lavsam.mymaterial.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.learn.lavsam.mymaterial.R
import com.learn.lavsam.mymaterial.ui.picture.PictureOfTheDayFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, PictureOfTheDayFragment.newInstance())
                .commitNow()
        }
    }
}