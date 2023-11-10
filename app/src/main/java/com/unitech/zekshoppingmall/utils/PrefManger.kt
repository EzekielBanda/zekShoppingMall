package com.unitech.zekshoppingmall.utils

import android.content.SharedPreferences
import android.content.Context

class PrefManger(context: Context) {

    private var pref : SharedPreferences
    private var editor :SharedPreferences.Editor

    // shared pref Mode
    private var PRIVATE_MODE = 0
    var isFirstTimeLaunch :Boolean
        get() = pref.getBoolean(IS_FIRST_TIME_LAUNCH, true)
        set(isFirstTime) {
            editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime)
            editor.commit()
        }
    companion object{
        //shared preferences file name
        private const val PREF_NAME ="androidhive-welcome"
        private const val IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch"

    }
    init {
        pref = context.getSharedPreferences(PREF_NAME,PRIVATE_MODE)
        editor  =pref.edit()
    }
}