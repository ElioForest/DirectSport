package com.example.directsport.ui.tennis

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TennisViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "C'est ICI le TENNIS"
    }
    val text: LiveData<String> = _text
}