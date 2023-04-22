package com.zmei.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.zmei.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bind : ActivityMainBinding
    private val adapter = AdapterClass()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)
        init()
    }
    private fun init(){
        bind.apply {
            recyclerID.layoutManager = GridLayoutManager(this@MainActivity, 3)
            recyclerID.adapter = adapter

        }

    }
}