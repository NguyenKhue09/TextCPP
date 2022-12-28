package com.khue.testcpp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.i("SecondActivity", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i("SecondActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("SecondActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("SecondActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("SecondActivity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("SecondActivity", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("SecondActivity", "onRestart")
    }
}