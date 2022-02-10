package com.example.web.presentation

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.web.data.database.repository.WebViewRepositoryImpl
import com.example.web.domain.GetLinkUseCase
import com.example.web.domain.LoadDataUseCase

class WebViewViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = WebViewRepositoryImpl(application)
    val getLinkUseCase = GetLinkUseCase(repository)
    val loadDataUseCase = LoadDataUseCase(repository)

}