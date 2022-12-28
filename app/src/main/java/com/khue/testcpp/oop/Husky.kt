package com.khue.testcpp.oop

class Husky: Dog {
    override fun bark() {
        println("Husky barking")
    }

    fun doSomething() {
        println("Husky running")
    }
}

open class a(private val x: Int) {
    open fun doSomething() {
        println("a")
    }
}

class b(x: Int): a(x) {
    override fun doSomething() {
        println("b")
    }
}

class x(val a: String) {
    override fun toString(): String {
        super.toString()
        return a
    }
}