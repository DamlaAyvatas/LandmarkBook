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

    /*
        val intent = intent
        //casting
        val selectedLandmark = intent.getSerializableExtra("landmark", Landmark::class.java) as Landmark
      //  val selectedLandmark = intent.getSerializableExtra("landmark") as Landmark


        binding.nameText.text = selectedLandmark.name
        binding.countryText.text = selectedLandmark.country
        binding.imageView.setImageResource(selectedLandmark.Image)
*/
    }
}
