package com.pogos.didagger2test.example2.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.pogos.didagger2test.example2.di.ApplicationScope
import javax.inject.Inject
import javax.inject.Provider

@ApplicationScope
class ViewModelFactory @Inject constructor(
    private val viewModelsProviders: @JvmSuppressWildcards Map<Class<out ViewModel>, Provider<ViewModel>>
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return viewModelsProviders[modelClass]?.get() as T
    }
}