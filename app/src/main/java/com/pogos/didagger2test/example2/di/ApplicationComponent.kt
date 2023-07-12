package com.pogos.didagger2test.example2.di

import android.content.Context
import com.pogos.didagger2test.example2.data.database.ExampleDatabase
import com.pogos.didagger2test.example2.data.network.ExampleApiService
import com.pogos.didagger2test.example2.presentation.ExampleViewModel
import com.pogos.didagger2test.example2.presentation.MainActivity
import com.pogos.didagger2test.example2.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@ApplicationScope
@Component(modules = [DataModule::class, DomainModule::class, ViewModelModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)

    fun inject(activity: MainActivity2)

    @Component.Factory
    interface ApplicationComponentFactory {

        fun create(
            @BindsInstance context: Context,
            @BindsInstance timeMillis: Long
        ): ApplicationComponent
    }

}