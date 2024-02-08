package com.capgemini.didemo

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class Car @Inject constructor( val engine: Engine) {


    fun start(){

        engine.start()
        Log.d("Car", "Started with ${engine.type}")
    }
}

class Engine @Inject constructor (@Named("ElecEngine") val type: String){

    fun start(){

    }
}

