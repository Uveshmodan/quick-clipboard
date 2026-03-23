package com.uvesh.clipboard

import android.content.Context
import android.content.SharedPreferences

class SharedPreferencesHelper(context: Context) {
    private val sharedPreferences: SharedPreferences = context.getSharedPreferences("clipboard_prefs", Context.MODE_PRIVATE)

    fun saveClipboardHistory(history: List<String>) {
        val editor = sharedPreferences.edit()
        editor.putStringSet("clipboard_history", history.toSet())
        editor.apply()
    }

    fun getClipboardHistory(): List<String> {
        return sharedPreferences.getStringSet("clipboard_history", setOf())?.toList() ?: emptyList()
    }
}