package com.pogos.didagger2test.example2

import android.app.Application
import com.pogos.didagger2test.example2.di.DaggerApplicationComponent

class ExampleApp : Application() {

    val component by lazy {
        DaggerApplicationComponent.factory()
            .create(this, System.currentTimeMillis())
    }
}