package com.shajt3ch.daggerinjection.model

/**
 * Created by Shakil Ahmed Shaj on 03,July,2020.
 * shakilahmedshaj@gmail.com
 */
class Coach private constructor() : TeamCoach {

    companion object {
        fun getCoachInstance(): Coach = Coach();
    }

    override fun getName(): String = "Russel Domingo"

    override fun getSpeciality(): String = "Batting"

}