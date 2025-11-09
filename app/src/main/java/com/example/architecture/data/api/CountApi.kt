package com.example.architecture.data.api

import com.example.architecture.data.models.CountDto
import com.example.architecture.domain.models.Count
import java.util.Date

class CountApi {
    private var count = 0
    private var type0f0peration = "nothing"

    fun increment() {
        count++
        type0f0peration = "increment"
    }

    fun decrement(){
        count--
        type0f0peration = "decrement"
    }

    fun resetCount(){
        count = 0
        type0f0peration = "reset"
    }

    fun getCount() : CountDto{
        return CountDto(
            count = count,
            type0f0peration = type0f0peration,
            createdAt = System.currentTimeMillis()
        )
    }
}