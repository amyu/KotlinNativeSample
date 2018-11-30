package com.nc.presentation.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nc.presentation.R

class MainActivity : AppCompatActivity(), MainContract.Navigator {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
