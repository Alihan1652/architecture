package com.example.architecture.di

import com.example.architecture.data.api.CountApi
import com.example.architecture.data.repisitory.CounterRepositoryImpl
import com.example.architecture.domain.repository.CounterRepository
import org.koin.dsl.module

val dataModule = module {
    single { CountApi() }
    single<CounterRepository> { CounterRepositoryImpl(api = get()) }
}