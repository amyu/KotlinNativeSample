package com.nc.presentation.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class MainViewModel : ViewModel() {
    val text: MutableLiveData<String> = MutableLiveData<String>().apply {
        value = "hoge"
    }
}