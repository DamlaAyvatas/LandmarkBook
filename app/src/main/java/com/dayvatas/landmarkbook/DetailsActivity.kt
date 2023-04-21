package com.dayvatas.landmarkbook

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.annotation.RequiresApi
import com.dayvatas.landmarkbook.databinding.ActivityDetailsBinding
import java.io.Serializable

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val intent = intent
        //casting
//        val selectedLandmark = intent.getSerializableExtra("landmark", Landmark::class.java) as Landmark

//        val selectedLandmark = chosenLandmark
        //Singleton
        val selectedLandmark = MySingleton.chosenLandmark

        selectedLandmark.let {
            binding.nameText.text = it?.name
            binding.countryText.text = it?.country
            binding.imageView.setImageResource(it?.Image!!)
        }
    }
}
