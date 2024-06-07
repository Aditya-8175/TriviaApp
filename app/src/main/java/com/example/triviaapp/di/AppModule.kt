package com.example.triviaapp.di

import com.example.triviaapp.network.QuestionApi
import com.example.triviaapp.repository.QuizRepository
import com.example.triviaapp.utils.constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun ProvideAllQuestion(): QuestionApi{
        return Retrofit.Builder()
            .baseUrl(constants.base_url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(QuestionApi::class.java)
    }

    @Singleton
    @Provides
    fun ProvidesRespository(api: QuestionApi) = QuizRepository(api)
}