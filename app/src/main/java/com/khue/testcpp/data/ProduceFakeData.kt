package com.khue.testcpp.data

import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class ProduceFakeData {

    private var listener: ((Int)->Unit)? = null

    init {
        GlobalScope.launch {
            var i = 0
            while (true) {
                delay(500)
                i++
                listener?.invoke(i)
                Log.d("ProduceFakeData", "x = $i")
                if (i == 1000000000) {
                    break
                }
            }
        }
    }


    fun subcribe(callback: (Int) -> Unit) {
        listener = callback
    }

}