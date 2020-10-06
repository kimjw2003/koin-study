package com.example.koin_study

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class Application : Application(){

    @Override
    override fun onCreate(){
        super.onCreate()

        startKoin{
            androidContext(applicationContext)
            modules(appModule)
        }
    }
}