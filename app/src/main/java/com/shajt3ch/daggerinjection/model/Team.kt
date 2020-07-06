package com.shajt3ch.daggerinjection.model

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Team @Inject constructor(val players: Players, val coach: TeamCoach) {

/*
    companion object {
        var instance: Team? = null

        @Synchronized
        fun getInstance(players: Players, coach: Coach): Team? {

            if (instance == null) {
                instance = Team(players, coach)
            }
            return instance
        }
    }
*/


    fun getBestEleven(): String = players.getPlayerName()

    fun getCoachName(): String = coach.getName()


}