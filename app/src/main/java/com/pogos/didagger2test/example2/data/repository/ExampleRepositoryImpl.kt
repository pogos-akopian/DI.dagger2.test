package com.pogos.didagger2test.example2.data.repository

import com.pogos.didagger2test.example2.data.datasource.ExampleLocalDataSource
import com.pogos.didagger2test.example2.data.datasource.ExampleRemoteDataSource
import com.pogos.didagger2test.example2.data.mapper.ExampleMapper
import com.pogos.didagger2test.example2.domain.ExampleRepository

class ExampleRepositoryImpl(
    private val localDataSource: ExampleLocalDataSource,
    private val remoteDataSource: ExampleRemoteDataSource,
    private val mapper: ExampleMapper
) : ExampleRepository {

    override fun method() {
        mapper.map()
        localDataSource.method()
        remoteDataSource.method()
    }
}
