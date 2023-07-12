package com.pogos.didagger2test.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.pogos.didagger2test.example2.domain.ExampleRepository
import javax.inject.Inject

class ExampleViewModel2 @Inject constructor(
    private val repository: ExampleRepository
) : ViewModel() {

    fun method() {
        repository.method()
        Log.d("ExampleViewModel2", "$this")
    }
}