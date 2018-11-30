package com.nc.domain_release.useCase

import com.nc.domain_release.service.SampleService

class SampleUseCaseImpl(
    private val sampleService: SampleService
) : SampleUseCase {
    override suspend fun execute(): String = sampleService.getSample()
}