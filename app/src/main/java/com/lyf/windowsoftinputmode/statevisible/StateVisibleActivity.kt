package com.lyf.windowsoftinputmode.statevisible

import android.content.Intent
import android.os.Bundle
import com.lyf.windowsoftinputmode.BaseActivity
import com.lyf.windowsoftinputmode.R
import com.lyf.windowsoftinputmode.stateunspecified.StateUnspecifiedActivity
import kotlinx.android.synthetic.main.activity_state_visible.*

class StateVisibleActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_state_visible)

        initListener()
    }

    private fun initListener() {
        btn_state_unspecified.setOnClickListener {
            startActivity(Intent(this, StateUnspecifiedActivity::class.java))
        }
    }
}
