package com.shajt3ch.daggerinjection

import android.app.Application
import com.shajt3ch.daggerinjection.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector

class App : Application(), HasAndroidInjector {

    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    override fun onCreate() {
        DaggerAppComponent.create().inject(this)
        super.onCreate()
    }

    override fun androidInjector(): AndroidInjector<Any> = dispatchingAndroidInjector

}