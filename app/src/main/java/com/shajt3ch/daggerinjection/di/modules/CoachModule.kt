package com.shajt3ch.daggerinjection.di.modules

import com.shajt3ch.daggerinjection.model.Coach
import dagger.Module
import dagger.Provides

/**
 * Created by Shakil Ahmed Shaj on 03,July,2020.
 * shakilahmedshaj@gmail.com
 */
@Module
class CoachModule {

    @Provides
    fun getCoach(): Coach = Coach.getCoachInstance()


}