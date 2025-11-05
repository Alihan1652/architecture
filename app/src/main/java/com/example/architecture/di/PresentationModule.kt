package com.example.architecture.di

import com.example.architecture.presentation.CountViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {
    viewModel {
        CountViewModel(
            incrementUseCace = get(),
            decrementUseCace = get(),
            resetCountUseCace = get(),
            getCountUseCace = get()
        )
    }
}