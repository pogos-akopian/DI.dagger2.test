package com.pogos.didagger2test.example2.data.network

import android.content.Context
import android.util.Log
import com.pogos.didagger2test.R
import com.pogos.didagger2test.example2.di.ApplicationScope
import javax.inject.Inject


@ApplicationScope
class ExampleApiService @Inject constructor(
    private val context: Context,
    private val timeMillis: Long
) {

    fun method() {
        Log.d(
            LOG_TAG, "ExampleApiService ${context.getString(R.string.app_name)}" +
                    "$timeMillis $this"
        )
    }

    companion object {

        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}
