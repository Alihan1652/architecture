package com.example.architecture.data.mapper

import com.example.architecture.data.models.CountDto
import com.example.architecture.domain.models.Count
import com.example.architecture.domain.models.Type0f0peration

fun CountDto.mapToDomain(): Count{
    return Count(
        count = this.count ?: 0,
        type0f0peration = Type0f0peration.toOperation(this.type0f0peration),
        createdAt = this.createdAt ?: 0L
    )
}