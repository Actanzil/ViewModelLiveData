package com.example.vmld.utilities

import com.example.vmld.data.MediaSementara
import com.example.vmld.data.OutputRepository
import com.example.vmld.form.FormViewModelFactory

object InjectorUtils {

    fun provideFormViewModelFactory(): FormViewModelFactory{
        val outputRepository = OutputRepository.getInstance(MediaSementara.getInstance().dataStr)
        return FormViewModelFactory(outputRepository)
    }
}