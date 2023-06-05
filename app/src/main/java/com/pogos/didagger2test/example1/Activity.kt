package com.pogos.didagger2test.example1

import com.example.dependencyinjectionstart.example1.*

class Activity {

    lateinit var computer: Computer
    lateinit var keyboard: Keyboard

    init {
        Component().inject(this)
    }
}