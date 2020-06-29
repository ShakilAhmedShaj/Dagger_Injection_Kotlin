package com.shajt3ch.daggerinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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