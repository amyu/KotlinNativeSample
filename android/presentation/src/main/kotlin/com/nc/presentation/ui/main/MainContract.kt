package com.nc.presentation.ui.main


interface MainContract {
    interface Presenter {
        fun setUp(
            view: View,
            viewModel: MainViewModel
        )

        fun onViewCreated()
    }

    interface View {

    }

    interface Navigator {

    }
}