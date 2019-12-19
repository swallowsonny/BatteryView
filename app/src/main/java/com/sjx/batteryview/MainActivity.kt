package com.sjx.batteryview

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bv.setLifecycleOwner(this)
        bv.setOnBatteryPowerListener { tv_power.text = "$it%" }
    }
}
