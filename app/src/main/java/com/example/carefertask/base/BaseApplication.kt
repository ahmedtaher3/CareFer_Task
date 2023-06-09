package com.example.carefertask.base

import android.app.Application
import com.example.carefertask.data.shared.DataManager
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class BaseApplication : Application() {
    var dataManager: DataManager? = null

    companion object {
        lateinit var instance: BaseApplication
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        dataManager = DataManager(applicationContext)
    }


}