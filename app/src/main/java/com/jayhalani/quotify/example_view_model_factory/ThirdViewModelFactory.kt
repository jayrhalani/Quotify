package com.jayhalani.quotify.example_view_model_factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

// TODO ASK-> What is ViewModelFactory?
// ViewModelFactory is used to pass data to ViewModel
class ThirdViewModelFactory(private val count: Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ThirdViewModel(count) as T
    }

}