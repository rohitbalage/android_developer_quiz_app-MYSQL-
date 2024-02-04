package com.rrbofficial.quizapp.retrofit


import com.rrbofficial.quizapp.model.QuestionsList
import retrofit2.Response
import retrofit2.http.GET

interface QuestionsAPI {

    @GET("questionsapi.php")
    suspend fun getQuestions(): Response<QuestionsList>


}