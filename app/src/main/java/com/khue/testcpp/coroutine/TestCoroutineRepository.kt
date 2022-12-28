package com.khue.testcpp.coroutine

import kotlinx.coroutines.Deferred

interface TestCoroutineRepository {
    suspend fun getTestCoroutine(): Deferred<Int>
}