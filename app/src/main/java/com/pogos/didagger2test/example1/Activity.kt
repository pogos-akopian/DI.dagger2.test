package com.pogos.didagger2test.example1

class Activity {

    lateinit var keyboard: Keyboard

    init {
        Component().inject(this)
    }
}