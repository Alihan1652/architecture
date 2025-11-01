package com.example.architecture.data.repisitory

import com.example.architecture.data.api.CountApi
import com.example.architecture.data.models.CountDto
import com.example.architecture.domain.models.Count
import com.example.architecture.domain.models.Type0f0peration
import com.example.architecture.domain.repository.CounterRepository
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class CounterRepositoryImpl(
    private val api: CountApi
): CounterRepository {

    override fun increment() {
        api.increment()
    }

    override fun decrement() {
        api.decrement()
    }

    override fun resetCount() {
        api.resetCount()
    }

    override fun getCount(): Count {
        val dto: CountDto = api.getCount()

        val type = when (dto.type0f0peration?.uppercase(Locale.ROOT)) {
            "INCREMENT" -> Type0f0peration.INCREMENT
            "DECREMENT" -> Type0f0peration.DECREMENT
            "RESET" -> Type0f0peration.RESET
            else -> Type0f0peration.RESET
        }

        val formattedDate = dto.createdAt?.let {
            val date = Date(it)
            SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(date)
        } ?: "--:--:--"

        return Count(
            count = dto.count ?: 0,
            type0f0peration = type,
            createdAt = formattedDate
        )
    }

}