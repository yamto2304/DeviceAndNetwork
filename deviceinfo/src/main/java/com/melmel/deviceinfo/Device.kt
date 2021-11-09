package com.melmel.deviceinfo

import android.content.Context
import android.os.Build

class Device {
    fun version() : String = Build.VERSION.RELEASE
    fun sdk() : Int {
        return Build.VERSION.SDK_INT
    }
    fun incremental() : String = Build.VERSION.INCREMENTAL
    fun board() : String = Build.BOARD


//    +"\nBOARD : "+Build.BOARD
//    +"\nBOOTLOADER : "+Build.BOOTLOADER
//    +"\nBRAND : "+Build.BRAND
//    +"\nCPU_ABI : "+Build.CPU_ABI
//    +"\nCPU_ABI2 : "+Build.CPU_ABI2
//    +"\nDISPLAY : "+Build.DISPLAY
//    +"\nFINGERPRINT : "+Build.FINGERPRINT
//    +"\nHARDWARE : "+Build.HARDWARE
//    +"\nHOST : "+Build.HOST
//    +"\nID : "+Build.ID
//    +"\nMANUFACTURER : "+Build.MANUFACTURER
//    +"\nMODEL : "+Build.MODEL
//    +"\nPRODUCT : "+Build.PRODUCT
//    +"\nSERIAL : "+Build.SERIAL
//    +"\nTAGS : "+Build.TAGS
//    +"\nTIME : "+Build.TIME
//    +"\nTYPE : "+Build.TYPE
//    +"\nUNKNOWN : "+Build.UNKNOWN
//    +"\nUSER : "+Build.USER;

}