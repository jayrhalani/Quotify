package com.jayhalani.quotify.example_view_model

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.jayhalani.quotify.R
import com.jayhalani.quotify.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    companion object {
        val TAG: String = SecondActivity::class.java.simpleName
    }

    private lateinit var binding: ActivitySecondBinding
    lateinit var secondViewModel: SecondViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_second)
        secondViewModel = ViewModelProvider(this).get(SecondViewModel::class.java)
        initClicks()
        setText()
    }

    private fun initClicks() {
        binding.btnIncrement.setOnClickListener {
            secondViewModel.increment()
            setText()
        }
    }


    private fun setText() {
        binding.tvCounter.text = secondViewModel.count.toString()
    }
}