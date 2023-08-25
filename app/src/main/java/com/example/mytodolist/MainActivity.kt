package com.example.mytodolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.mytodolist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myMutableList = binding.myList
        val countries = listOf(" EAST AFRICA","Uganda","Kenya",
            "Tanzania","Rwanda","Burundi","Tanzania","South Sudan")
        val arrayAdapter = ArrayAdapter(this,R.layout.second_layout,R.id.country,countries)

        myMutableList.adapter = arrayAdapter

    }
}