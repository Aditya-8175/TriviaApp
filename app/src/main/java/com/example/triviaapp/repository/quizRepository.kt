package com.example.triviaapp.repository

import android.util.Log
import com.example.triviaapp.data.DataOrExecption
import com.example.triviaapp.module.Question
import com.example.triviaapp.module.QuestionItem
import com.example.triviaapp.network.QuestionApi
import javax.inject.Inject

class QuizRepository @Inject constructor(private val api: QuestionApi){

    private val dataOrExecption = DataOrExecption<ArrayList<QuestionItem>,
            Boolean, Exception>()

    suspend fun getAllQue(): DataOrExecption<ArrayList<QuestionItem>, Boolean, java.lang.Exception> {

        try {
            dataOrExecption.loading = true
            dataOrExecption.data = api.getApi()
            if (dataOrExecption.data.toString().isNotEmpty()) dataOrExecption.loading = false
        }
        catch (exception: Exception){
            dataOrExecption.exc = exception
            Log.d("Exc", "getAllQue: ${dataOrExecption.exc!!.localizedMessage}")
        }

        return dataOrExecption

    }


}