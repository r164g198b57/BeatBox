package com.github.r164g198b57.beatbox

import android.content.res.AssetManager
import android.util.Log

private const val TAG = "BeatBox1947"
private const val SOUNDS_FOLDER = "sample_sounds"

class BeatBox (private val assets: AssetManager){

    fun loadSounds(): List<String> {
        try {
            val soundNames = assets.list(SOUNDS_FOLDER)!!
            Log.d(TAG, "Раптам знойдзена ${soundNames.size} гука")
            return soundNames.asList()
        } catch (e: Exception){
            Log.d(TAG, "Спіс актываў адсутнічае", e)
            return emptyList()
        }
    }

}