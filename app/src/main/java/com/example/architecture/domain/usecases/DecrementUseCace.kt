package com.example.architecture.domain.usecases

import com.example.architecture.domain.repository.CounterRepository

class DecrementUseCace(
    private val repository: CounterRepository,
) {

    fun decrement() {
        repository.decrement()
    }

}