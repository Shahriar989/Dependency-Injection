package com.shahriar.a07_dependency_injection_class_12_2.car_factory

import android.util.Log
import javax.inject.Inject

class Wheel @Inject constructor(){

    fun moving(): String{
        Log.i("TAG", "Wheel Moving.......")
        return "Wheel Moving......."
    }
}