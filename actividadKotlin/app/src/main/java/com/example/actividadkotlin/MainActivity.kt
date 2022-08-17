package com.example.actividadkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.actividadkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var a: ActivityMainBinding

            override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

                a = ActivityMainBinding.inflate(layoutInflater)
                setContentView(a.root)

                var valorcampo1 = a.campo1.text
                var valorcampo2 = a.campo2.text


                a.campo1.text = valorcampo2

                a.campo2.text = valorcampo1
            }

}