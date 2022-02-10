package com.example.web.domain

class LoadDataUseCase(private val repository: WebViewRepository) {

    suspend operator fun invoke() = repository.loadData()
}