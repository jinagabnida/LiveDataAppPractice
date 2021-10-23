package com.example.livedatapratice

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val inputText : MutableLiveData<String> = MutableLiveData()
}