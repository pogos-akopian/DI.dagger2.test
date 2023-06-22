package com.pogos.didagger2test.example2.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pogos.didagger2test.R
import com.pogos.didagger2test.example2.di.DaggerApplicationComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ExampleViewModel

    private val component by lazy {
        DaggerApplicationComponent.builder()
            .context(application)
            .currentTime(System.currentTimeMillis())
            .build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
    }
}