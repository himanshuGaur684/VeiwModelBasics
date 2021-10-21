package com.gaur.androidfundamentals

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.gaur.androidfundamentals.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {


    private val viewModel: MainViewModel by viewModels()

    lateinit var binding: ActivityMainBinding

    private var counter = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.incrementCounter.setOnClickListener {
            viewModel.incrementCounter()
        }

        viewModel.counter.observe(this){
            binding.counterText.text = it.toString()
        }


    }
}