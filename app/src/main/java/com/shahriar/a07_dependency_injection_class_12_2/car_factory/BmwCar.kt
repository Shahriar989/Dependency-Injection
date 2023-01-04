package com.shahriar.a07_dependency_injection_class_12_2.car_factory

import javax.inject.Inject

class BmwCar @Inject constructor(
    private val engine: Engine,
    private val wheel: Wheel,
    private val headlight: Headlight
) {
    fun testTheCar(): String{

        return engine.start()+
                wheel.moving()+
                headlight.lighting()
    }
}