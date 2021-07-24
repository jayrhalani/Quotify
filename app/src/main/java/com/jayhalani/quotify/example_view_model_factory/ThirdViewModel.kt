package com.jayhalani.quotify.example_view_model_factory

import androidx.lifecycle.ViewModel

class ThirdViewModel(initialCount: Int) : ViewModel() {

    var count = initialCount

    fun increment() {
        count++
    }
}