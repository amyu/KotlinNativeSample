package com.nc.infra_release

import com.nc.domain_release.service.SampleService
import com.nc.domain_release.system.BuildFlavor
import com.nc.infra_release.api.ApiClient
import com.nc.infra_release.service.SampleServiceImpl
import org.kodein.di.Kodein
import org.kodein.di.erased.bind
import org.kodein.di.erased.instance
import org.kodein.di.erased.provider


fun infraReleaseModule(buildFlavor: BuildFlavor) = Kodein.Module("infra_release") {
    bind<String>("apiUrl") with provider {
        when (buildFlavor) {
            BuildFlavor.Prod -> "https://tools.ietf.org/rfc/rfc1866.txt"
            BuildFlavor.Stg -> "https://tools.ietf.org/rfc/rfc1866.txt"
            BuildFlavor.Qa -> "https://tools.ietf.org/rfc/rfc1866.txt"
            BuildFlavor.Dev -> "https://tools.ietf.org/rfc/rfc1866.txt"
        }
    }
    bind<ApiClient>() with provider { ApiClient(instance("apiUrl")) }

    bind<SampleService>() with provider { SampleServiceImpl(instance()) }
}