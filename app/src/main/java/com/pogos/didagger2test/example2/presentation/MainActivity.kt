package com.pogos.didagger2test.example2.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pogos.didagger2test.R
import com.pogos.didagger2test.example1.Activity

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: ExampleViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
    }
}