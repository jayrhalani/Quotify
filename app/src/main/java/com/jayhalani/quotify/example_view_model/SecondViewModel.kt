package com.jayhalani.quotify.example_view_model

import androidx.lifecycle.ViewModel

// TODO ASK-> What is ViewModel?
class SecondViewModel : ViewModel() {

    var count = 0

    fun increment() {
        count++
    }
}