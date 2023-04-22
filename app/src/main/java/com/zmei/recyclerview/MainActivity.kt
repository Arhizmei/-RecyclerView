package com.zmei.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.zmei.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bind : ActivityMainBinding
    private val adapter = AdapterClass()
    private val imageIdList = listOf(
                R.drawable.plant1,
                R.drawable.plant2,
                R.drawable.plant3,
                R.drawable.plant4,
                R.drawable.plant5)
    private var index = 0
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
            button.setOnClickListener {
                if (index>4) index =0
                val plant = PlantDataClass(imageIdList[index], "Plant $index")
                adapter.addPlant(plant)
                index++

            }

        }

    }
}