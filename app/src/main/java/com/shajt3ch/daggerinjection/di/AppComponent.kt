package com.shajt3ch.daggerinjection.di

import com.shajt3ch.daggerinjection.App
import com.shajt3ch.daggerinjection.di.modules.ActivityBuilderModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

/**
 * Created by Shakil Ahmed Shaj on 29,June,2020.
 * shakilahmedshaj@gmail.com
 */

@Component(

    modules = [
        AndroidSupportInjectionModule::class,
        ActivityBuilderModule::class
    ]

)
interface AppComponent : AndroidInjector<App>