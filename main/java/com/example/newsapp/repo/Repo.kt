package com.example.newsapp.repo

import com.example.newsapp.network.apiProvider
import com.example.newsapp.network.response.NewsModel
import retrofit2.Response

class Repo {
    suspend fun getNewsRepo(): Response<NewsModel> {
        return apiProvider.provideApi().getNews()
    }
}