package com.jayhalani.quotify.app_quotify

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

//// TODO ASK -> What T stands for?
class QuoteViewModelFactory(val context: Context) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return QuoteViewModel(context) as T
    }
}