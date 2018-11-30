package com.nc.presentation

import com.nc.presentation.ui.main.MainContract
import com.nc.presentation.ui.main.MainPresenter
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider


val presentationModule = Kodein.Module("presentation") {
    bind<MainContract.Presenter>() with provider { MainPresenter(instance("ui"), instance()) }
}