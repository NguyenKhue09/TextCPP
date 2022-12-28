package com.khue.testcpp

import com.khue.testcpp.coroutine.TestCoroutineRepository
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner
import org.mockito.kotlin.doReturn
import org.mockito.kotlin.mock
import org.mockito.kotlin.whenever

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(MockitoJUnitRunner::class)
class CoroutineUnitTest {

    @Mock
    lateinit var testCoroutineRepository: TestCoroutineRepository

    @Test
    fun get_data() = runBlocking{
        val x = mock<TestCoroutineRepository> {
            onBlocking { getTestCoroutine() } doReturn GlobalScope.async { 1 }
        }

        x.getTestCoroutine().await().also {
            println("x = $it")
            assertEquals(1, it)
        }
        Unit
    }
}