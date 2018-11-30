package com.nc.base

import com.nc.di_debug.diDebugKodein
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware


class DebugApplication : BaseApplication(), KodeinAware {
    override val kodein: Kodein = Kodein.lazy {
        extend(super.kodein)
        extend(diDebugKodein)
    }
}