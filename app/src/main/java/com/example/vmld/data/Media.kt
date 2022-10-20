package com.example.vmld.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class Media {
    private val dataList = mutableListOf<Data>()
    private val isidata = MutableLiveData<List<Data>>()

    init {
        isidata.value = dataList
    }

    fun addData(tambahdata: Data){
        dataList.add(tambahdata)
        isidata.value = dataList
    }

    fun getData() = isidata as LiveData<List<Data>>
}