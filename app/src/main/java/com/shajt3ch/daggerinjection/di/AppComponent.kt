package com.shajt3ch.daggerinjection.di

import com.shajt3ch.daggerinjection.App
import com.shajt3ch.daggerinjection.di.modules.ActivityBuilderModule
import com.shajt3ch.daggerinjection.di.modules.CoachModule
import com.shajt3ch.daggerinjection.di.modules.TeamCoachModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by Shakil Ahmed Shaj on 29,June,2020.
 * shakilahmedshaj@gmail.com
 */

@Singleton
@Component(

    modules = [
        AndroidSupportInjectionModule::class,
        ActivityBuilderModule::class,
        CoachModule::class,
        TeamCoachModule::class
    ]

)
interface AppComponent : AndroidInjector<App>