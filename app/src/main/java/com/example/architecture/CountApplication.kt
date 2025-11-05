package com.example.architecture

import android.app.Application
import com.example.architecture.di.dataModule
import com.example.architecture.di.domainModule
import com.example.architecture.di.presentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class CountApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@CountApplication)
            modules(
                dataModule,
                domainModule,
                presentationModule
            )
        }
    }
}