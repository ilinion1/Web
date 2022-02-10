package com.example.web.data.database.repository

import android.app.Application
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.example.web.data.database.AppDatabase
import com.example.web.data.mapper.WebViewMapper
import com.example.web.data.network.api.ApiFactory
import com.example.web.domain.LinkContainer
import com.example.web.domain.WebViewRepository

class WebViewRepositoryImpl(private val application: Application) : WebViewRepository {

    private val webViewDao = AppDatabase.getInstance(application).webViewDao()
    private val mapper = WebViewMapper()
    private val apiService = ApiFactory.apiService

    override fun getLink(): LiveData<LinkContainer> {
        return Transformations.map(webViewDao.getLink()) {
            mapper.mapDbModelToEntity(it)
        }
    }

    override suspend fun loadData() {
        try {
            val linkDto = apiService.loadLink()
            val linkDbModel = mapper.mapDtoToDbModel(linkDto)
            webViewDao.insertDatabase(linkDbModel)
        } catch (e: Exception) {
            Log.d("MyLog", "Нет интернета")
        }
    }
}