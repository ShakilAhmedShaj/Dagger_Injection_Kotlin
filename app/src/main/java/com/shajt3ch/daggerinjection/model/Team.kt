package com.shajt3ch.daggerinjection.model

import javax.inject.Inject

class Team @Inject constructor(val players: Players) {

    fun getBestEleven(): String = players.getPlayerName()


}