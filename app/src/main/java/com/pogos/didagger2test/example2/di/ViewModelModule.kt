package com.pogos.didagger2test.example2.di

import androidx.lifecycle.ViewModel
import com.pogos.didagger2test.example2.presentation.ExampleViewModel
import com.pogos.didagger2test.example2.presentation.ExampleViewModel2
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
interface ViewModelModule {

    @IntoMap
    @ViewModelKey(ExampleViewModel::class)
    @Binds
    fun bindExampleViewModel(iml: ExampleViewModel): ViewModel

    @IntoMap
    @ViewModelKey(ExampleViewModel2::class)
    @Binds
    fun bindExampleViewModel2(iml: ExampleViewModel2): ViewModel
}