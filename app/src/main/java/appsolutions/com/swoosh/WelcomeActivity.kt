package appsolutions.com.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import appsolutions.com.swoosh.R.id.start_button
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        start_button.setOnClickListener{
            val intent = Intent(this, LeagueActivity::class.java)
            startActivity(intent)
        }
    }
}
