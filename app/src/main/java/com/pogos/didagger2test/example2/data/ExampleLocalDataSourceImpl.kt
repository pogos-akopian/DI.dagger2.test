package com.pogos.didagger2test.example2.data

import com.example.dependencyinjectionstart.example2.data.ExampleDatabase

class ExampleLocalDataSourceImpl(
    private val database: ExampleDatabase
) : ExampleLocalDataSource {

    override fun method() {

    }
}
