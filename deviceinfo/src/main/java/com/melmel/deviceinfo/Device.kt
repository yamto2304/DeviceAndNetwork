package com.melmel.deviceinfo

import android.os.Build

class Device {
    /**
     * Return version of Device
     */
    fun version(): String = Build.VERSION.RELEASE

    /**
     * Return sdk number of Device
     */
    fun sdk(): Int = Build.VERSION.SDK_INT

    /**
     * Return incremental  of Device
     */
    fun incremental(): String = Build.VERSION.INCREMENTAL

    /**
     * Return board  of Device
     */
    fun board(): String = Build.BOARD

    /**
     * Return bootLoader  of Device
     */
    fun bootLoader(): String = Build.BOOTLOADER

    /**
     * Return brand  of Device
     */
    fun brand(): String = Build.BRAND

    /**
     * Return display  of Device
     */
    fun display(): String = Build.DISPLAY

    /**
     * Return fingerPrint  of Device
     */
    fun fingerPrint(): String = Build.FINGERPRINT

    /**
     * Return hardware  of Device
     */
    fun hardware(): String = Build.HARDWARE

    /**
     * Return host  of Device
     */
    fun host(): String = Build.HOST

    /**
     * Return id  of Device
     */
    fun id(): String = Build.ID

    /**
     * Return manufacturer  of Device
     */
    fun manufacturer(): String = Build.MANUFACTURER

    /**
     * Return model  of Device
     */
    fun model(): String = Build.MODEL

    /**
     * Return product  of Device
     */
    fun product(): String = Build.PRODUCT

    /**
     * Return tags  of Device
     */
    fun tags(): String = Build.TAGS

    /**
     * Return time  of Device
     */
    fun time(): Long = Build.TIME

    /**
     * Return type  of Device
     */
    fun type(): String = Build.TYPE

    /**
     * Return unknown  of Device
     */
    fun unknown(): String = Build.UNKNOWN

    /**
     * Return user  of Device
     */
    fun user(): String = Build.USER
}