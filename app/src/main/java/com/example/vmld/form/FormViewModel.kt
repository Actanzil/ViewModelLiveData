package com.example.vmld.form

import androidx.lifecycle.ViewModel
import com.example.vmld.data.Data
import com.example.vmld.data.OutputRepository

class FormViewModel(private val outputRepository: OutputRepository): ViewModel(){

    fun getData() = outputRepository.getData()

    fun addData(tambahdata: Data) = outputRepository.addData(tambahdata)

}