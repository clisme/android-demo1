package com.example.myapplication8.ui.settings

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SettingsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "个人设置页面|个人设置页面|个人设置页面|个人设置页面|个人设置页面|个人设置页面|个人设置页面"
    }
    val text: LiveData<String> = _text
}