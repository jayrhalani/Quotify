package com.jayhalani.quotify.app_quotify

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.jayhalani.quotify.R

class QuoteActivity : AppCompatActivity() {

    companion object {
        val TAG: String = QuoteActivity::class.java.simpleName
    }

    private val fabShare: FloatingActionButton
        get() = findViewById(R.id.floatingActionButton)
    private val tvQuoteText: TextView
        get() = findViewById(R.id.quoteText)
    private val tvQuoteAuthor: TextView
        get() = findViewById(R.id.quoteAuthor)
    private val tvQuoteNext: TextView
        get() = findViewById(R.id.tvQuoteNext)
    private val tvQuotePrevious: TextView
        get() = findViewById(R.id.tvQuotePrevious)

    private lateinit var quoteViewModel: QuoteViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quote)
        setContentView(R.layout.activity_quote)
        quoteViewModel = ViewModelProvider(
            this,
            QuoteViewModelFactory(application)
        ).get(QuoteViewModel::class.java)

        setQuote(quoteViewModel.getQuote())

        initClickListeners()
    }

    private fun initClickListeners() {
        fabShare.setOnClickListener {
            onShare(quoteViewModel.getQuote())
        }
        tvQuoteNext.setOnClickListener {
            onNext()
        }
        tvQuotePrevious.setOnClickListener {
            onPrevious()
        }
    }

    private fun onShare(quote: Quote) {
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_TEXT, "${quote.text} \n- ${quote.author}")
        startActivity(intent)
    }

    private fun setQuote(quote: Quote) {
        tvQuoteText.text = quote.text
        tvQuoteAuthor.text = quote.author
        Log.e(TAG, "setQuote: ${quote.text} - ${quote.author}")
    }

    private fun onPrevious() {
        setQuote(quoteViewModel.previousQuote())
    }

    private fun onNext() {
        setQuote(quoteViewModel.nextQuote())
    }
}