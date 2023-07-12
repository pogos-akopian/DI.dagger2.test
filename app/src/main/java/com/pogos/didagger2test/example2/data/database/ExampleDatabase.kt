package com.pogos.didagger2test.example2.data.database

import android.content.Context
import android.util.Log
import com.pogos.didagger2test.R
import com.pogos.didagger2test.example2.di.ApplicationScope
import javax.inject.Inject
import javax.inject.Singleton


@ApplicationScope
class ExampleDatabase @Inject constructor(
    private val context: Context,
    private val timeMillis: Long
) {

    fun method() {
        Log.d(ExampleDatabase.LOG_TAG, "ExampleApiService ${context.getString(R.string.app_name)}" +
                "$timeMillis $this")
    }

    companion object {

        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}

