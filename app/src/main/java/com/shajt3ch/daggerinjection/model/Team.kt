package com.shajt3ch.daggerinjection.model

import com.shajt3ch.daggerinjection.model.Players

class Team(val players: Players) {

    fun getBestEleven(): String = players.getPlayerName()


}