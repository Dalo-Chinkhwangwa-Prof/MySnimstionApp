package com.example.admin.bitmapanimation.view

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.admin.bitmapanimation.R
import com.example.admin.bitmapanimation.databinding.ActivityMainBinding
import com.example.admin.bitmapanimation.viewmodel.EntryPointViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var dataBindingUtil : ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        dataBindingUtil.viewModel = EntryPointViewModel(this, "Say Hi to Dalo")
    }
}
