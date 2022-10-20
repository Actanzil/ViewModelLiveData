package com.example.vmld.form

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.vmld.data.OutputRepository

class FormViewModelFactory(private val outputRepository: OutputRepository) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return FormViewModel(outputRepository) as T
    }
}