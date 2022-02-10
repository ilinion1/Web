package com.example.web.domain

import androidx.lifecycle.LiveData

interface WebViewRepository {

    fun getLink(): LiveData<LinkContainer>

    suspend fun loadData()
}