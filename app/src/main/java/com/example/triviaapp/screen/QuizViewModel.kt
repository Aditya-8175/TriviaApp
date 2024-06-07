package com.example.triviaapp.screen

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.triviaapp.data.DataOrExecption
import com.example.triviaapp.module.QuestionItem
import com.example.triviaapp.repository.QuizRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class QuizViewModel @Inject constructor(private val repository: QuizRepository) : ViewModel() {
    val data: MutableState<DataOrExecption<ArrayList<QuestionItem>, Boolean, Exception>> = mutableStateOf(
        DataOrExecption(null, true, Exception(""))
    )

    init {
        getAllQue()
    }

    private fun getAllQue(){
        viewModelScope.launch {
            data.value.loading = true
            data.value = repository.getAllQue()
            if (data.value.toString().isNotEmpty()) data.value.loading = false
        }
    }

    fun getTotalQuestionCount(): Int {
        return data.value.data?.toMutableList()?.size!!
    }
}