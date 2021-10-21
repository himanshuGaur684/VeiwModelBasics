package com.gaur.androidfundamentals

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(): ViewModel() {

    var count = 0

    private val _counter = MutableLiveData<Int>()
    val counter : LiveData<Int> = _counter


    fun incrementCounter(){
        count++
       _counter.postValue(count)
    }


    fun reset(){
        count=0
        _counter.postValue(count)
    }




}