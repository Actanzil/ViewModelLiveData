package com.example.vmld.data

class OutputRepository private constructor(private val dataStr: Media){

    fun addData(tambahdata: Data){
        dataStr.addData(tambahdata)
    }

    fun getData() = dataStr.getData()

    companion object{
        @Volatile private var instance: OutputRepository? = null

        fun getInstance(dataStr: Media) = instance ?: synchronized(this) {
            instance ?: OutputRepository(dataStr).also {
                instance = it
            }
        }
    }
}