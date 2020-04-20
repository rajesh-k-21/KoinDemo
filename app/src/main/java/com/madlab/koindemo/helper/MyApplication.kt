package com.madlab.koindemo.helper

import android.app.Application
import com.madlab.koindemo.di.apiModule
import com.madlab.koindemo.di.repositoryModule
import com.madlab.koindemo.di.retrofitModule
import com.madlab.koindemo.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@MyApplication)
            modules(listOf(repositoryModule, viewModelModule, retrofitModule, apiModule))
        }
    }
}