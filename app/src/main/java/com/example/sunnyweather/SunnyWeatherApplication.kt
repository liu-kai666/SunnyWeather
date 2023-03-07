package com.example.sunnyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication:Application() {
    companion object{
        @SuppressLint
        lateinit var context: Context
        const val TOKEN = "mYJ68yFHuJpITLw3"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}