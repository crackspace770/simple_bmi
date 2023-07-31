package com.fajar.volumebalok

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.fajar.volumebalok.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnCalculate.setOnClickListener {
               // val inputLength = edPanjang.text.toString().trim()
                val inputWeight= edBerat.text.toString().trim()
                val inputHeight = edTinggi.text.toString().trim()

                val volume = inputWeight.toDouble() / (inputHeight.toDouble() * inputHeight.toDouble())
                tvResult.text = volume.toString()
            }
        }

    }
}