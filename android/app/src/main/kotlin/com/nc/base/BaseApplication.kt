package com.nc.base

import android.app.Application
import com.nc.di_release.diReleaseKodein
import com.nc.domain_release.system.BuildFlavor
import com.nc.presentation.presentationModule
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.androidModule


open class BaseApplication : Application(), KodeinAware {
    override val kodein: Kodein = Kodein.lazy {
        import(androidModule(this@BaseApplication))
        import(applicationModule)
        import(presentationModule)
        extend(diReleaseKodein(BuildFlavor.fromString(BuildConfig.FLAVOR)))
    }
}