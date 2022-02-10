package com.example.web.data.network.api

import com.example.web.data.network.model.LinkContainerDto
import retrofit2.http.GET

interface ApiService {

    @GET(KEY)
    suspend fun loadLink(): LinkContainerDto

    companion object{
        const val KEY = "prod"
    }

}