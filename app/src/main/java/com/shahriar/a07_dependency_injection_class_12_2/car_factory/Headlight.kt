package com.shahriar.a07_dependency_injection_class_12_2.car_factory

import android.util.Log
import javax.inject.Inject

class Headlight @Inject constructor() {

    fun lighting(): String{
        Log.i("TAG", "Headlight Lighting....... :)")
        return "Headlight Lighting....... :)"
    }
}