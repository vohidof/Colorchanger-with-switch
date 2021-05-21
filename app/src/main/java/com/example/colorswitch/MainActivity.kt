package com.example.colorswitch

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.colorswitch.utils.MyData
import com.example.colorswitch.utils.MySharedPreference
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_clickme.setOnClickListener {
            startActivity(Intent(this, ColorActivity::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        MySharedPreference.init(this)

        if (MySharedPreference.color == 1 || MySharedPreference.color == 2 || MySharedPreference.color == 3 || MySharedPreference.color == 4 || MySharedPreference.color == 5 || MySharedPreference.color == 6 || MySharedPreference.color == 7) {
            root.setBackgroundColor(resources.getColor(MyData.color))
        } else
            root.setBackgroundColor(Color.WHITE)
    }
}