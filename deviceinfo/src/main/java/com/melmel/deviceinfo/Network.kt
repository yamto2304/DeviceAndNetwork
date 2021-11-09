package com.melmel.deviceinfo

import android.annotation.SuppressLint
import android.content.Context
import android.net.wifi.WifiManager
import android.text.format.Formatter
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class Network {
    /**
     * Return IpAddress
     */
    fun getIpAddress(context: Context): String {
        val wifiManager = context.getSystemService(AppCompatActivity.WIFI_SERVICE) as WifiManager
        return Formatter.formatIpAddress(wifiManager.connectionInfo.ipAddress)
    }

    /**
     * Return MAC Address
     * Not require in real, it just an assignment
     */
    @SuppressLint("HardwareIds", "MissingPermission")
    fun getMacAddress(context: Context): String {
        val manager = context.getSystemService(Context.WIFI_SERVICE) as WifiManager
        val info = manager.connectionInfo
        return info.macAddress.uppercase(Locale.getDefault())
    }
}