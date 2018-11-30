package com.nc.di_debug

import com.nc.domain_debug.domainDebugModule
import com.nc.infra_debug.infraDebugModule
import org.kodein.di.Kodein


val diDebugKodein = Kodein {
    import(domainDebugModule)
    import(infraDebugModule)
}