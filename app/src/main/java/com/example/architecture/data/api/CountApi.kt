package com.example.architecture.data.api

import com.example.architecture.data.models.CountDto
import com.example.architecture.domain.models.Count
import java.util.Date

class CountApi {
    private var count = 0

    fun increment() {
        count++
    }

    fun decrement(){
        count--
    }

    fun resetCount(){
        count = 0
    }

    fun getCount() : CountDto{
        return CountDto(
            count = count,
            type0f0peration = null,
            createdAt = System.currentTimeMillis()
        )
    }
}