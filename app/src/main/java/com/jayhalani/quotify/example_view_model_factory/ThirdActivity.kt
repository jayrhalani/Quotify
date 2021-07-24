package com.jayhalani.quotify.example_view_model_factory

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.jayhalani.quotify.R
import com.jayhalani.quotify.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    companion object {
        val TAG: String = ThirdActivity::class.java.simpleName
    }

    private lateinit var binding: ActivityThirdBinding
    lateinit var thirdViewModel: ThirdViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_third)
        thirdViewModel =
            ViewModelProvider(this, ThirdViewModelFactory(10)).get(ThirdViewModel::class.java)
        initClicks()
        setText()
    }

    private fun initClicks() {
        binding.btnIncrement.setOnClickListener {
            thirdViewModel.increment()
            setText()
        }
    }


    private fun setText() {
        binding.tvCounter.text = thirdViewModel.count.toString()
    }
}