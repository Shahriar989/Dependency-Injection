package com.shahriar.a07_dependency_injection_class_12_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.shahriar.a07_dependency_injection_class_12_2.car_factory.BmwCar
import com.shahriar.a07_dependency_injection_class_12_2.car_factory.Engine
import com.shahriar.a07_dependency_injection_class_12_2.car_factory.Headlight
import com.shahriar.a07_dependency_injection_class_12_2.car_factory.Wheel
import com.shahriar.a07_dependency_injection_class_12_2.di.Container
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: BmwCar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val status = findViewById<TextView>(R.id.status)

//        val myCar = BmwCar(
//            Container.getEngine(),
//            Container.getWheel(),
//            Container.getHeadlight()
//        )
        //myCar.testTheCar()
        status.text = car.testTheCar()
    }
}