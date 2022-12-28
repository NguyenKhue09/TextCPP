package com.khue.testcpp

import android.util.Log
import com.khue.testcpp.data.ProduceFakeData
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.random.Random

class TestCoroutine {

    private val x = MutableSharedFlow<Int>(extraBufferCapacity = 1)
    private val y = MutableSharedFlow<Int>(extraBufferCapacity = 1)
    private val produceFakeData = ProduceFakeData()
    suspend fun init() {
        produceFakeData.subcribe {
            x.tryEmit(it)
        }
        initCalFakeData()
    }

    suspend fun getY(): Deferred<Int> = withContext(Dispatchers.IO) {
        async {
            y.first()
        }
    }

    private suspend fun initCalFakeData() {
        runRetry()
    }

    private suspend fun runRetry(): Int {
        for (i in 0 until 5) {
            try {
                return runFakeCalData(i).also {
                    Log.d("TestCoroutine", "text init: $it")
                }
            } catch (e: Exception) {
                if(e is TimeoutCancellationException) delay(1000)
                Log.e("TestCoroutine", "time out")
            }
        }
        return runFakeCalData(6).also {
            Log.d("TestCoroutine", "test init: $it")
        }
    }

    private suspend fun runFakeCalData(i: Int): Int = withTimeout(2000) {
        Log.d("TestCoroutine", "runFakeCalData $i times")
        if(Random.nextInt(0, 1001).also { Log.d("TestCoroutine", "random num $it") }.mod(2) == 0) delay(3000) // fake call data
        else delay(1000)
        getI().also {
            Log.d("TestCoroutine", "runFakeCalData y emit $it")
            y.emit(it)
        }
    }

    suspend fun getI(): Int {
        return x.map {
                Log.d("TestCoroutine", "x.map = $it")
                it
            }.first().also {
                Log.d("TestCoroutine", "x.first = $it")
            }
    }
}