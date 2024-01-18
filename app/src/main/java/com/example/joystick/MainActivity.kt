package com.example.joystick

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var joystickLeftView: JoystickView = findViewById(R.id.joystickView_left)
        joystickLeftView.setOnMoveListener{ angle, strength ->
            // do whatever you want
            Log.d("LEFT", ">>>>>>>>>>>>>>>>>>> LEFT: angle = "+angle+ " | strength = "+strength)
        }

        var joystickRightView: JoystickView = findViewById(R.id.joystickView_right)
        joystickRightView.setOnMoveListener{ angle, strength ->
            // do whatever you want
            Log.d("RIGHT", ">>>>>>>>>>>>>>>>>>> RIGHT: angle = "+angle+ " | strength = "+strength)
        }
    }
}