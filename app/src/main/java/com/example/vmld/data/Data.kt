package com.example.vmld.data

data class Data(val nim: String, val nama: String, val kelas: String){
    override fun toString(): String {
        return "NIM Mahasiswa   : $nim \nNama Mahaiswa  : $nama \nKelas Mahasiswa   : $kelas"
    }
}
