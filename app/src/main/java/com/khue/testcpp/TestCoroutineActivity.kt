package com.khue.testcpp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TestCoroutineActivity : AppCompatActivity() {
    private val testCoroutine = TestCoroutine()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_coroutine)

        lifecycleScope.launch(Dispatchers.IO) {
                testCoroutine.init()
        }

        lifecycleScope.launch(Dispatchers.IO) {
//            testCoroutine.getY().await().also {
//                Log.i("TestCoroutine", "get success y in activit: $it")
//            }
            testCoroutine.getI()
        }
    }
}