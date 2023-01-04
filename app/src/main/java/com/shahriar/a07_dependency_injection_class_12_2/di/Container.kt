package com.shahriar.a07_dependency_injection_class_12_2.di

import com.shahriar.a07_dependency_injection_class_12_2.car_factory.Engine
import com.shahriar.a07_dependency_injection_class_12_2.car_factory.Headlight
import com.shahriar.a07_dependency_injection_class_12_2.car_factory.Wheel

class Container {

    companion object {

        private var engine: Engine? = null
        private var wheel: Wheel? = null
        private var headlight: Headlight? = null

        fun getEngine(): Engine {

            if (engine != null) {
                return engine as Engine
            } else {
                engine = Engine()
            }
            return engine as Engine
        }

        fun getWheel(): Wheel {

            if (wheel != null) {
                return wheel as Wheel
            } else {
                wheel = Wheel()
            }
            return wheel as Wheel
        }

        fun getHeadlight(): Headlight {

            if (headlight != null) {
                return headlight as Headlight
            } else {
                headlight = Headlight()
            }
            return headlight as Headlight
        }
    }
}