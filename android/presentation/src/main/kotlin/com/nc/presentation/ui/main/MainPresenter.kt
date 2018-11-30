package com.nc.presentation.ui.main

import com.nc.domain_release.useCase.SampleUseCase
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class MainPresenter(
    private val dispatcher: CoroutineDispatcher,
    private val sampleUseCase: SampleUseCase
) : MainContract.Presenter {
    private lateinit var view: MainContract.View
    private lateinit var viewModel: MainViewModel

    override fun setUp(
        view: MainContract.View,
        viewModel: MainViewModel
    ) {
        this.view = view
        this.viewModel = viewModel
    }

    override fun onViewCreated() {
        GlobalScope.launch(dispatcher) {
            viewModel.text.value = sampleUseCase.execute()
        }
    }
}