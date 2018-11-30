package com.nc.base

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.provider


val applicationModule = Kodein.Module("application_module") {
    bind<CoroutineDispatcher>("ui") with provider { Dispatchers.Main }
}