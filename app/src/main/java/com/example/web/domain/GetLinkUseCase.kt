package com.example.web.domain

class GetLinkUseCase(private val repository: WebViewRepository) {

    operator fun invoke() = repository.getLink()

}