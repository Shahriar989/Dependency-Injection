package com.shahriar.a07_dependency_injection_class_12_2.car_factory

import android.util.Log
import javax.inject.Inject

class Engine @Inject constructor(){

    fun start(): String{

        Log.i("TAG", "Engine Starting.......")
        return "Engine Starting......."
    }
}