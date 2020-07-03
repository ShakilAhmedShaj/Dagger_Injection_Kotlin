package com.shajt3ch.daggerinjection.model

/**
 * Created by Shakil Ahmed Shaj on 03,July,2020.
 * shakilahmedshaj@gmail.com
 */
class Coach private constructor() {

    companion object{
        fun getCoachInstance(): Coach = Coach();
    }

    fun getName(): String = "Russel Domingo"

    fun getSpeciality(): String = "Batting"


}