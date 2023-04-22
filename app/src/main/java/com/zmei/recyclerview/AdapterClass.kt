package com.zmei.recyclerview

import android.view.View
import androidx.recyclerview.widget.RecyclerView

class AdapterClass : RecyclerView.Adapter <AdapterClass.HolderClass>{
    class HolderClass(item: View): RecyclerView.ViewHolder(item) {
    fun bind(plant: PlantDataClass){

    }
    }
}