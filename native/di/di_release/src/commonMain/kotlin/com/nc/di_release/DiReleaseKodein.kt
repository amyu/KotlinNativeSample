package com.nc.di_release

import com.nc.domain_release.domainReleaseModule
import com.nc.domain_release.system.BuildFlavor
import com.nc.infra_release.infraReleaseModule
import org.kodein.di.Kodein


fun diReleaseKodein(buildFlavor: BuildFlavor) = Kodein {
    import(domainReleaseModule)
    import(infraReleaseModule(buildFlavor))
}
