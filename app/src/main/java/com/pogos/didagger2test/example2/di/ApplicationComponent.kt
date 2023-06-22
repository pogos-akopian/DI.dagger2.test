package com.pogos.didagger2test.example2.di

import android.content.Context
import com.pogos.didagger2test.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)

    @Component.Builder
    interface ApplicationComponentBuilder {

        @BindsInstance
        fun context(context: Context): ApplicationComponentBuilder

        @BindsInstance
        fun currentTime(timeMillis: Long): ApplicationComponentBuilder

        fun build(): ApplicationComponent
    }
}