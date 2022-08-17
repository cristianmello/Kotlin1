package com.example.kotlin2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var a: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        a = ActivityMainBinding.inflate(layoutInflater)
        setContentView(a.root)

        a.campovacio1.text = "campo1"

        a.campovacio2.text = "campo2"
    }
}