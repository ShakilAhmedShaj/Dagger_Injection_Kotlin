package com.shajt3ch.daggerinjection.model

import javax.inject.Inject

class Players @Inject constructor() {

    fun getPlayerName() :String{



        return "Shakib, Tamim, Mashrafee"
    }

}