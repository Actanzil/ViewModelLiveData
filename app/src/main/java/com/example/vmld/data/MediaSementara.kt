package com.example.vmld.data

class MediaSementara private constructor(){

    var dataStr = Media()
    private set
    companion object{
        @Volatile private var instance: MediaSementara? = null

        fun getInstance() = instance ?: synchronized(this){
            instance ?: MediaSementara().also {
                instance = it
            }
        }
    }

}