package com.robining.android.paramsinject.demo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvContent.setOnClickListener {
            val intent = Intent(this@MainActivity, LoginActivity::class.java)
            intent.putExtra("data","My name is Luo")
            intent.putExtra("int",199)
            startActivity(intent)
        }
    }
}
