package com.shajt3ch.daggerinjection.di.modules

import com.shajt3ch.daggerinjection.model.Coach
import com.shajt3ch.daggerinjection.model.TeamCoach
import dagger.Binds
import dagger.Module

/**
 * Created by Shakil Ahmed Shaj on 06,July,2020.
 * shakilahmedshaj@gmail.com
 */

@Module
abstract class TeamCoachModule {

    @Binds
    abstract fun getteamCoach(coach: Coach): TeamCoach


}