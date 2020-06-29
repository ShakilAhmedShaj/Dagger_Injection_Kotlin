package com.shajt3ch.daggerinjection

class Team(val players: Players) {

    fun getBestEleven(): String = players.getPlayerName()


}