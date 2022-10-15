package com.example.odin_2_8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var frag1 = Fragment_1()
        var frag2 = Fragment_2()

        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.frgmCont, frag1)
        transaction.commit()

        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frgmCont, frag2)
            transaction.commit()
        }


    }

}