package com.example.architecture.domain.models

enum class Type0f0peration(
    val value: String?
) {
    INCREMENT("increment"), // increment
    DECREMENT("decrement"), // decrement
    RESET("reset"), // reset
    NOTHING("nothing"); // nothing

    companion object{
        fun toOperation(value: String?): Type0f0peration{
            return Type0f0peration.entries.firstOrNull { value == it.value } ?: NOTHING
        }
    }
}