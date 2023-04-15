package com.dayvatas.landmarkbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
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

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val layoutAdapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = layoutAdapter


/*
        //Adapter: Layout & Data
        //Mapping
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarkList.map { landmark -> landmark.name })
        binding.listView.adapter = adapter

        binding.listView.onItemClickListener = AdapterView.OnItemClickListener{ _, view, position, _ ->
            val intent = Intent(MainActivity@this, DetailsActivity::class.java)
            intent.putExtra("landmarkList", landmarkList[position].name)
            startActivity(intent)
        }
        */
    }
}









