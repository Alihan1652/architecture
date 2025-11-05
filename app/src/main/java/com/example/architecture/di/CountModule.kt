package com.example.architecture.di

import com.example.architecture.data.api.CountApi
import com.example.architecture.data.repisitory.CounterRepositoryImpl
import com.example.architecture.domain.repository.CounterRepository
import com.example.architecture.domain.usecases.DecrementUseCace
import com.example.architecture.domain.usecases.GetCountUseCace
import com.example.architecture.domain.usecases.IncrementUseCace
import com.example.architecture.domain.usecases.ResetCountUseCace
import org.koin.dsl.module

val countAppModule = module {
    //data
    single { CountApi() }

    single<CounterRepository> { CounterRepositoryImpl(api = get()) }

    single { IncrementUseCace(repository = get()) }
    single { DecrementUseCace(repository = get()) }
    single { ResetCountUseCace(repository = get()) }
    single { GetCountUseCace(repository = get()) }
}