package appsolutions.com.swoosh

import android.content.Intent
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_beginner.*


class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beginner)

        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

        fun skillSelectedClicked(view: View){
            if(!skill.isEmpty()) {
                val finishActivity = Intent(this, FinishActivity::class.java)
                finishActivity.putExtra(EXTRA_LEAGUE, league)
                finishActivity.putExtra(EXTRA_SKILL, skill)
                startActivity(finishActivity)
            }
        }

        fun ballerSelectedClicked(view: View){
            beginner_begin.isSelected = false
            beginner_baller.isSelected = true
            skill = "baller"
        }

        fun beginnerSelectedClicked(view: View){
            beginner_begin.isSelected = true
            beginner_baller.isSelected = false
            skill = "beginner"
        }

}
