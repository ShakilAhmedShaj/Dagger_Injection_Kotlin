package com.shajt3ch.daggerinjection.model

import javax.inject.Inject

class Team @Inject constructor(val players: Players, val coach: Coach) {

    fun getBestEleven(): String = players.getPlayerName()

    fun getCoachName(): String = coach.getName()


}