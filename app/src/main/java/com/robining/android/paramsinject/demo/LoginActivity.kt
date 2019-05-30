package com.robining.android.paramsinject.demo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.robining.android.paramsinject.AutoParam
import com.robining.android.paramsinject.AutoParamCompat
import kotlinx.android.synthetic.main.activity_main.*

class LoginActivity : AppCompatActivity() {
    @AutoParam("data")
    private lateinit var data: String
    @AutoParam("int")
    private var num : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AutoParamCompat.injectValue(this,intent.extras,savedInstanceState)
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        tvContent.text = "$data/$num"
    }
}
