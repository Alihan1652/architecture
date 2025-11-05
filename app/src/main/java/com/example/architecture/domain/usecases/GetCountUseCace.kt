package com.example.architecture.domain.usecases

import com.example.architecture.domain.models.Count
import com.example.architecture.domain.repository.CounterRepository

class GetCountUseCace(
    private val repository: CounterRepository,
) {

    fun getCount(): Count {
        return repository.getCount()
    }

}