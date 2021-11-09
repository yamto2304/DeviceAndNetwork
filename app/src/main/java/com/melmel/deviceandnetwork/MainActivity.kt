package com.melmel.deviceandnetwork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.melmel.deviceandnetwork.databinding.ActivityMainBinding
import com.melmel.deviceinfo.Device
import com.melmel.deviceinfo.Network


class MainActivity : AppCompatActivity() {
    private val device by lazy { Device() }
    private val network by lazy { Network() }
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initDeviceInfo()
        initNetworkInfo()
    }

    private fun initNetworkInfo() {
        val ipAddress = network.getIpAddress(applicationContext)
        binding.tvIpValue.text = ipAddress

        val macAddress = network.getMacAddress(applicationContext)
        binding.tvMacValue.text = macAddress
    }

    private fun initDeviceInfo() {
        val sdk: String = device.sdk().toString()
        val brand : String = device.brand()

        binding.tvSdkNumber.text = sdk
        binding.tvBrandValue.text = brand
    }
}