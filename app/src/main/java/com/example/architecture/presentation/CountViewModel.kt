package com.example.architecture.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.architecture.domain.models.Count
import com.example.architecture.domain.usecases.DecrementUseCace
import com.example.architecture.domain.usecases.GetCountUseCace
import com.example.architecture.domain.usecases.IncrementUseCace
import com.example.architecture.domain.usecases.ResetCountUseCace

class CountViewModel(
    private val incrementUseCace: IncrementUseCace,
    private val decrementUseCace: DecrementUseCace,
    private val resetCountUseCace: ResetCountUseCace,
    private val getCountUseCace: GetCountUseCace,
) : ViewModel() {

    private val _countData = MutableLiveData<Count>()
    val countData: LiveData<Count> = _countData

    fun increment(){
        incrementUseCace.increment()
    }

    fun decrement(){
        decrementUseCace.decrement()
    }

    fun resetCount(){
        resetCountUseCace.resetCount()
    }

     private fun getCount(){
        val response = getCountUseCace.getCount()
         _countData.value = response
    }

}