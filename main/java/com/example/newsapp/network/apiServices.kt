package com.example.newsapp.network

import com.example.newsapp.network.response.NewsModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface apiServices {

    @GET("top-headlines")
    suspend fun getNews(
        @Query("country") country: String = "us",
        @Query("category") category: String = "business",
        @Query("apiKey") apiKey: String = "7354a6654c9a419a8b62fbc0cf376167"
    ): Response<NewsModel>


}