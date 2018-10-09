package appsolutions.com.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_desired.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desired)

        desired_next.setOnClickListener { view ->
            if(!selectedLeague.isEmpty()) {
                val skillActivity = Intent(this, SkillActivity::class.java)
                skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
                startActivity(skillActivity)
            }
            else{
                Toast.makeText(this, "Please select a league to continue", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun onMensClicked(view: View){
        desired_womens.isSelected = false
        desired_coed.isSelected = false
        desired_mens.isSelected = true
        selectedLeague = "mens"
    }

    fun onWomensClicked(view: View){
        desired_womens.isSelected = true
        desired_coed.isSelected = false
        desired_mens.isSelected = false
        selectedLeague = "womens"
    }

    fun onCoedsClicked(view: View){
        desired_womens.isSelected = false
        desired_coed.isSelected = true
        desired_mens.isSelected = false
        selectedLeague = "coed"
    }
}
