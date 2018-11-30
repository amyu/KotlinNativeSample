package com.nc.infra_release.service

import com.nc.domain_release.service.SampleService
import com.nc.infra_release.api.ApiClient


class SampleServiceImpl(
    private val apiClient: ApiClient
) : SampleService {
    override suspend fun getSample(): String = apiClient.fetchSampleApi()
}