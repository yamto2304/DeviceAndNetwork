package com.melmel.deviceandnetwork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.melmel.deviceinfo.Device
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private val version by lazy { Device() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    private fun initView() {
        val tvMain = findViewById<TextView>(R.id.tvMain)
        val sdk : String = version.sdk().toString()

        tvMain.text = sdk
    }
}