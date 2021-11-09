package com.melmel.deviceandnetwork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import com.melmel.deviceinfo.Device
import android.widget.TextView
import com.melmel.deviceinfo.Device


class MainActivity : AppCompatActivity() {
    private val version by lazy { Device() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    private fun initView() {
        val tvSdkNumber = findViewById<TextView>(R.id.tvSdkNumber)
//        val tvBrandValue = findViewById<TextView>(R.id.tvBrandValue)
        val sdk: String = version.sdk().toString()
//        val brand : String = version.brand()
        tvSdkNumber.text = sdk
//        tvBrandValue.text = brand
    }
}