package com.lyf.windowsoftinputmode

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lyf.windowsoftinputmode.adjustnothing.AdjustNothingActivity
import com.lyf.windowsoftinputmode.adjustnothing.AdjustNothingScrollActivity
import com.lyf.windowsoftinputmode.adjustpan.AdjustPanActivity
import com.lyf.windowsoftinputmode.adjustpan.AdjustPanScrollActivity
import com.lyf.windowsoftinputmode.adjustresize.AdjustResizeActivity
import com.lyf.windowsoftinputmode.adjustresize.AdjustResizeScrollActivity
import com.lyf.windowsoftinputmode.adjustunspecified.AdjustUnspecifiedActivity
import com.lyf.windowsoftinputmode.adjustunspecified.AdjustUnspecifiedScrollActivity
import com.lyf.windowsoftinputmode.stateunspecified.StateUnspecifiedActivity
import com.lyf.windowsoftinputmode.stateunspecified.StateUnspecifiedScrollActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initListener()
    }

    private fun initListener() {
        btn_state_unspecified.setOnClickListener {
            startActivity(Intent(this, StateUnspecifiedActivity::class.java))
        }

        btn_state_unspecified_scroll.setOnClickListener {
            startActivity(Intent(this, StateUnspecifiedScrollActivity::class.java))
        }

        btn_adjust_unspecified.setOnClickListener {
            startActivity(Intent(this, AdjustUnspecifiedActivity::class.java))
        }

        btn_adjust_unspecified_scroll.setOnClickListener {
            startActivity(Intent(this, AdjustUnspecifiedScrollActivity::class.java))
        }

        btn_adjust_resize.setOnClickListener {
            startActivity(Intent(this, AdjustResizeActivity::class.java))
        }

        btn_adjust_resize_scroll.setOnClickListener {
            startActivity(Intent(this, AdjustResizeScrollActivity::class.java))
        }

        btn_adjust_pan.setOnClickListener {
            startActivity(Intent(this, AdjustPanActivity::class.java))
        }

        btn_adjust_pan_scroll.setOnClickListener {
            startActivity(Intent(this, AdjustPanScrollActivity::class.java))
        }

        btn_adjust_nothing.setOnClickListener {
            startActivity(Intent(this, AdjustNothingActivity::class.java))
        }

        btn_adjust_nothing_scroll.setOnClickListener {
            startActivity(Intent(this, AdjustNothingScrollActivity::class.java))
        }
    }
}
