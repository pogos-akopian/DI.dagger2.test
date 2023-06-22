package com.pogos.didagger2test.example2.di

import com.pogos.didagger2test.example2.data.repository.ExampleRepositoryImpl
import com.pogos.didagger2test.example2.domain.ExampleRepository
import dagger.Binds
import dagger.Module

@Module
interface DomainModule {

    @Binds
    fun bindRepository(impl: ExampleRepositoryImpl): ExampleRepository

}