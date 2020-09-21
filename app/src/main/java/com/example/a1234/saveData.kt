package com.example.a1234

import android.content.Context
import android.content.SharedPreferences

class saveData (context: Context){
    private var sharedPreferences: SharedPreferences = context.getSharedPreferences("file", Context.MODE_PRIVATE)


    // This method will save the night MOde state : True or False

    fun setDarkModeState(state: Boolean){
        val editor = sharedPreferences.edit()
        editor.putBoolean("Dark", state!!)
        editor.apply()

    }

    // This method will load the night Mode state

    fun loadDarkModeState(): Boolean? {
        val state = sharedPreferences.getBoolean("Dark", false)
        return  (state)
    }


}











