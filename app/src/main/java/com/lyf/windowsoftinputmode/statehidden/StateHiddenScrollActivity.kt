package com.lyf.windowsoftinputmode.statehidden

import android.content.Intent
import android.os.Bundle
import com.lyf.windowsoftinputmode.BaseActivity
import com.lyf.windowsoftinputmode.R
import com.lyf.windowsoftinputmode.stateunspecified.StateUnspecifiedScrollActivity
import kotlinx.android.synthetic.main.activity_state_hidden_scroll.*

class StateHiddenScrollActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_state_hidden_scroll)

        initListener()
    }

    private fun initListener() {
        btn_state_unspecified_scroll.setOnClickListener {
            startActivity(Intent(this, StateUnspecifiedScrollActivity::class.java))
        }
    }
}
