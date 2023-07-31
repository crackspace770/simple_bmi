package com.fajar.volumebalok

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fajar.volumebalok.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnCalculate.setOnClickListener {

                val inputWeight= edBerat.text.toString().trim()
                val inputHeight = edTinggi.text.toString().trim()

                val volume = inputWeight.toDouble() / (inputHeight.toDouble() * inputHeight.toDouble())
                tvResult.text = volume.toString()

                val state:String =
                    if ((tvResult.text as String) < 25.toString()){
                    "Normal"
                } else if(tvResult.text as String > 25.toString()){
                    "Overweight"
                } else if(tvResult.text as String > 35.toString()){
                    "Obesity"
                } else if ((tvResult.text as String) < 18.toString()){
                    "Underweight"
                }else{
                    "Undetermined"
                }

                tvState.text = state
            }
        }

    }
}