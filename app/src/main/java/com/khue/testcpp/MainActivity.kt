package com.khue.testcpp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.lifecycleScope
import com.khue.testcpp.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {

    init {
        lifecycle.addObserver(MyObserver())
    }

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        supportFragmentManager.beginTransaction()
//            .add(R.id.container,  TestFragment()).commit()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.i("MainActivity", "onCreate")

//        binding.btnStart.setOnClickListener {
//            startActivity(Intent(this, SecondActivity::class.java))
//            finish()
//        }
//
//        binding.btnDialog.setOnClickListener {
//            AlertDialog.Builder(this)
//                .setTitle("Your Alert")
//                .setMessage("Your Message")
//                .setCancelable(false)
//                .setPositiveButton("ok"
//                ) { dialog, which ->
//                    // Whatever...
//                }.show()
//        }

        binding.rmview.background.alpha = 50
        binding.tvlayout.alpha = 0.5f
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i("MainActivity", "onRestoreInstanceState")
    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MainActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity", "onStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i("MainActivity", "onSaveInstanceState")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MainActivity", "onRestart")
    }

    inner class MyObserver : DefaultLifecycleObserver {

        override fun onCreate(owner: LifecycleOwner) {
            super.onCreate(owner)
            Log.i("MainActivity", "MyObserver onCreate, lifecycle state: ${lifecycle.currentState}")
        }

        override fun onStart(owner: LifecycleOwner) {
            super.onStart(owner)
            Log.i("MainActivity", "MyObserver onStart, lifecycle state: ${lifecycle.currentState}")
        }

        override fun onResume(owner: LifecycleOwner) {
            super.onResume(owner)
            Log.i("MainActivity", "MyObserver onResume, lifecycle state: ${lifecycle.currentState}")
        }

        override fun onPause(owner: LifecycleOwner) {
            super.onPause(owner)
            Log.i("MainActivity", "MyObserver onPause, lifecycle state: ${lifecycle.currentState}")
        }

        override fun onStop(owner: LifecycleOwner) {
            super.onStop(owner)
            Log.i("MainActivity", "MyObserver onStop, lifecycle state: ${lifecycle.currentState}")
        }

        override fun onDestroy(owner: LifecycleOwner) {
            super.onDestroy(owner)
            Log.i(
                "MainActivity",
                "MyObserver onDestroy, lifecycle state: ${lifecycle.currentState}"
            )
        }
    }
}
