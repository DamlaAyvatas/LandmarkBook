package com.dayvatas.landmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dayvatas.landmarkbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var landmarkList : ArrayList<Landmark>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList<Landmark>()
        //Data
        val pisa = Landmark("Pisa Tower", "Italy", R.drawable.pisa)
        val londonBridge = Landmark("London Bridge", "England", R.drawable.london)
        val eiffel = Landmark("Eiffel Tower", "France", R.drawable.eiffel)
        val colosseum = Landmark("Colosseum", "Italy", R.drawable.collesium)

        landmarkList.add(pisa)
        landmarkList.add(londonBridge)
        landmarkList.add(eiffel)
        landmarkList.add(colosseum)

    }
}