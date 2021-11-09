package com.melmel.deviceandnetwork

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import com.melmel.deviceinfo.Device
import com.melmel.deviceandnetwork.databinding.ActivityMainBinding
import com.melmel.deviceinfo.Device
import android.net.wifi.WifiManager
import android.text.format.Formatter
import com.melmel.deviceinfo.Network
import java.util.*


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

    @SuppressLint("MissingPermission", "HardwareIds")
    private fun initNetworkInfo() {
//        val wifiManager = applicationContext.getSystemService(WIFI_SERVICE) as WifiManager
//        val ipAddress: String = Formatter.formatIpAddress(wifiManager.connectionInfo.ipAddress)
        val ipAddress = network.getIpAddress(applicationContext)
        binding.tvIpValue.text = ipAddress

//        val manager = this.getSystemService(Context.WIFI_SERVICE) as WifiManager
//        val info = manager.connectionInfo.macAddress.uppercase(Locale.getDefault())
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