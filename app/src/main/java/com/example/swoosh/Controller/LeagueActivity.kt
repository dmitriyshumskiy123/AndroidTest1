package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Utilities.EXTRA_LEAGUE
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View)
    {
        womens_league_btn.isChecked = false
        coeds_league_btn.isChecked = false

        selectedLeague = "mens"
    }

    fun onWomensClicked(view: View)
    {
        mens_league_btn.isChecked = false
        coeds_league_btn.isChecked = false

        selectedLeague = "womens"
    }

    fun onCoedClicked(view: View)
    {
        mens_league_btn.isChecked = false
        womens_league_btn.isChecked = false

        selectedLeague = "coed"
    }

    fun leagueNextClicked(view: View)
    {
        if(selectedLeague != "")
        {
        val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        }
        else
        {
            Toast.makeText(this, "Please, select a league.", Toast.LENGTH_SHORT).show()
        }
    }


}
