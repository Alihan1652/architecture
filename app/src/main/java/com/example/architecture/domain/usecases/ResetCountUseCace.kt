package com.example.architecture.domain.usecases

import com.example.architecture.domain.repository.CounterRepository

class ResetCountUseCace(
    private val repository: CounterRepository,
) {

    fun resetCount() {
        repository.resetCount()
    }

}
