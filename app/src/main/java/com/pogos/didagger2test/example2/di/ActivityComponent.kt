package com.pogos.didagger2test.example2.di

import com.pogos.didagger2test.example2.presentation.MainActivity
import com.pogos.didagger2test.example2.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Subcomponent

@Subcomponent(
    modules = [ViewModelModule::class]
)
interface ActivityComponent {

    fun inject(activity: MainActivity)

    fun inject(activity: MainActivity2)

    @Subcomponent.Factory
    interface Factory {
        fun create(
            @BindsInstance id: String
        ): ActivityComponent
    }

}