package com.nc.infra_release.api


import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.url

class ApiClient(
    private val apiUrl: String
) {
    private val client = HttpClient()

    suspend fun fetchSampleApi(): String =
        client.get {
            url(apiUrl)
        }
}