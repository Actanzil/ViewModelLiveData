package com.example.vmld.data

data class Data(val nim: String, val nama: String, val kelas: String){
    override fun toString(): String {
        return "$nim - $nama - $kelas"
    }
}
