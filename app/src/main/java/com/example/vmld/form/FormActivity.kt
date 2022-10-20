package com.example.vmld.form

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.vmld.R
import com.example.vmld.data.Data
import com.example.vmld.utilities.InjectorUtils

class FormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.form_main)
        initializeUi()
    }

    private fun initializeUi(){
        val factory = InjectorUtils.provideFormViewModelFactory()
        val viewModel = ViewModelProviders.of(this, factory).get(FormViewModel::class.java)
        val tv_data = findViewById<TextView>(R.id.tv_data)
        val bt_simpan = findViewById<Button>(R.id.bt_simpan)
        val et_nim = findViewById<EditText>(R.id.et_nim)
        val et_nama = findViewById<EditText>(R.id.et_nama)
        val et_kelas = findViewById<EditText>(R.id.et_kelas)

        viewModel.getData().observe(this, Observer {
            isidata -> val stringBuilder = StringBuilder()
            isidata.forEach {
                isidata -> stringBuilder.append("$isidata\n\n")
            }
            tv_data.text = stringBuilder.toString()
        })

        bt_simpan.setOnClickListener {
            val data = Data(et_nim.text.toString(), et_nama.text.toString(), et_kelas.text.toString())
            viewModel.addData(data)
            et_nim.setText("")
            et_nama.setText("")
            et_kelas.setText("")
        }
    }
}