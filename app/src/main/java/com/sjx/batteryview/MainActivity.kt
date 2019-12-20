package com.sjx.batteryview

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bv_1.setLifecycleOwner(this)
        bv_2.setLifecycleOwner(this)
        bv_3.setLifecycleOwner(this)
        bv_4.setLifecycleOwner(this)
        bv_1.setOnBatteryPowerListener { tv_power.text = "$it%" }
    }
}
