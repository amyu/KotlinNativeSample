package com.nc.domain_release

import com.nc.domain_release.useCase.SampleUseCase
import com.nc.domain_release.useCase.SampleUseCaseImpl
import org.kodein.di.Kodein
import org.kodein.di.erased.bind
import org.kodein.di.erased.instance
import org.kodein.di.erased.provider


val domainReleaseModule = Kodein.Module("domain_release") {
    bind<SampleUseCase>() with provider { SampleUseCaseImpl(instance()) }
}