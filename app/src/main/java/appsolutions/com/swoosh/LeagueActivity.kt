package appsolutions.com.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_desired.*

class LeagueActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desired)

        desired_next.setOnClickListener { view ->
            val skillActivity = Intent(this, SkillActivity::class.java)
            startActivity(skillActivity)
        }
    }
}
