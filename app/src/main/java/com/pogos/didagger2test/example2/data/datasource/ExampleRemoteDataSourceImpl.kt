package com.pogos.didagger2test.example2.data.datasource

import com.pogos.didagger2test.example2.data.network.ExampleApiService

class ExampleRemoteDataSourceImpl(
    private val apiService: ExampleApiService
) : ExampleRemoteDataSource {

    override fun method() {
        apiService.method()
    }
}
