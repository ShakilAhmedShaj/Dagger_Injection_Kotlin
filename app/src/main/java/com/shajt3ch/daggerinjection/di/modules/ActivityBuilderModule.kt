package com.shajt3ch.daggerinjection.di.modules

import com.shajt3ch.daggerinjection.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Shakil Ahmed Shaj on 29,June,2020.
 * shakilahmedshaj@gmail.com
 */
@Module
abstract class ActivityBuilderModule {


    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity


}