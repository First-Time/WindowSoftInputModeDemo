package com.lyf.windowsoftinputmode.stateunspecified

import android.content.Intent
import android.os.Bundle
import com.lyf.windowsoftinputmode.BaseActivity
import com.lyf.windowsoftinputmode.R
import com.lyf.windowsoftinputmode.statealwayshidden.StateAlwaysHiddenActivity
import com.lyf.windowsoftinputmode.statealwaysvisible.StateAlwaysVisibleActivity
import com.lyf.windowsoftinputmode.statehidden.StateHiddenActivity
import com.lyf.windowsoftinputmode.stateunchanged.StateUnchangedActivity
import com.lyf.windowsoftinputmode.statevisible.StateVisibleActivity
import kotlinx.android.synthetic.main.activity_state_unspecified.*

class StateUnspecifiedActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_state_unspecified)

        initListener()
    }

    private fun initListener() {
        btn_state_unchanged.setOnClickListener {
            startActivity(Intent(this, StateUnchangedActivity::class.java))
        }

        btn_state_hidden.setOnClickListener {
            startActivity(Intent(this, StateHiddenActivity::class.java))
        }

        btn_state_always_hidden.setOnClickListener {
            startActivity(Intent(this, StateAlwaysHiddenActivity::class.java))
        }

        btn_state_visible.setOnClickListener {
            startActivity(Intent(this, StateVisibleActivity::class.java))
        }

        btn_state_always_visible.setOnClickListener {
            startActivity(Intent(this, StateAlwaysVisibleActivity::class.java))
        }
    }
}
