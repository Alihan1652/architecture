package com.example.architecture.di

import com.example.architecture.domain.usecases.DecrementUseCace
import com.example.architecture.domain.usecases.GetCountUseCace
import com.example.architecture.domain.usecases.IncrementUseCace
import com.example.architecture.domain.usecases.ResetCountUseCace
import org.koin.dsl.module

val domainModule = module {
    single { IncrementUseCace(repository = get()) }
    single { DecrementUseCace(repository = get()) }
    single { ResetCountUseCace(repository = get()) }
    single { GetCountUseCace(repository = get()) }
}