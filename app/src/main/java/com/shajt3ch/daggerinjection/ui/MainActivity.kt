package com.shajt3ch.daggerinjection.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shajt3ch.daggerinjection.model.Players
import com.shajt3ch.daggerinjection.R
import com.shajt3ch.daggerinjection.model.Team
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val players = Players()
        val team = Team(players)


        btn_get_team.setOnClickListener {


            tv_player_name.text = team.getBestEleven()


        }


    }
}