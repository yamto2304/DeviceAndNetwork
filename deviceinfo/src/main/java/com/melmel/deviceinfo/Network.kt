package com.melmel.deviceinfo

import android.annotation.SuppressLint
import android.content.Context
import android.net.wifi.WifiManager
import android.text.format.Formatter
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class Network {
    fun getIpAddress(context: Context): String {
        val wifiManager = context.getSystemService(AppCompatActivity.WIFI_SERVICE) as WifiManager
        return Formatter.formatIpAddress(wifiManager.connectionInfo.ipAddress)
    }

    @SuppressLint("HardwareIds", "MissingPermission")
    fun getMacAddress(context: Context): String {
        val manager = context.getSystemService(Context.WIFI_SERVICE) as WifiManager
        val info = manager.connectionInfo
//        if (ActivityCompat.checkSelfPermission(
//                context,
//                Manifest.permission.ACCESS_FINE_LOCATION
//            ) != PackageManager.PERMISSION_GRANTED
//        ) {
//            Toast.makeText(context, "You need ACCESS_FINE_LOCATION permission", Toast.LENGTH_SHORT)
//                .show()
//            return "Need Permission"
//        }
        return info.macAddress.uppercase(Locale.getDefault())
    }
}