package com.example.architecture.domain.repository

import com.example.architecture.domain.models.Count

interface CounterRepository {

    fun increment()

    fun decrement()

    fun getCount(): Count

    fun resetCount()
}