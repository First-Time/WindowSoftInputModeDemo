package com.lyf.windowsoftinputmode.stateunspecified

import android.content.Intent
import android.os.Bundle
import com.lyf.windowsoftinputmode.BaseActivity
import com.lyf.windowsoftinputmode.R
import com.lyf.windowsoftinputmode.statealwayshidden.StateAlwaysHiddenScrollActivity
import com.lyf.windowsoftinputmode.statealwaysvisible.StateAlwaysVisibleScrollActivity
import com.lyf.windowsoftinputmode.statehidden.StateHiddenScrollActivity
import com.lyf.windowsoftinputmode.stateunchanged.StateUnchangedScrollActivity
import com.lyf.windowsoftinputmode.statevisible.StateVisibleScrollActivity
import kotlinx.android.synthetic.main.activity_state_unspecified_scroll.*

class StateUnspecifiedScrollActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_state_unspecified_scroll)

        initListener()
    }

    private fun initListener() {
        btn_state_unchanged_scroll.setOnClickListener {
            startActivity(Intent(this, StateUnchangedScrollActivity::class.java))
        }

        btn_state_hidden_scroll.setOnClickListener {
            startActivity(Intent(this, StateHiddenScrollActivity::class.java))
        }

        btn_state_always_hidden_scroll.setOnClickListener {
            startActivity(Intent(this, StateAlwaysHiddenScrollActivity::class.java))
        }

        btn_state_visible_scroll.setOnClickListener {
            startActivity(Intent(this, StateVisibleScrollActivity::class.java))
        }

        btn_state_always_visible_scroll.setOnClickListener {
            startActivity(Intent(this, StateAlwaysVisibleScrollActivity::class.java))
        }
    }
}
