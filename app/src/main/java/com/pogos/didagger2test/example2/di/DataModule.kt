package com.pogos.didagger2test.example2.di

import com.pogos.didagger2test.example2.data.datasource.ExampleLocalDataSource
import com.pogos.didagger2test.example2.data.datasource.ExampleLocalDataSourceImpl
import com.pogos.didagger2test.example2.data.datasource.ExampleRemoteDataSource
import com.pogos.didagger2test.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @ApplicationScope
    @Binds
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource
}