package com.example.colorswitch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.colorswitch.utils.MyData
import com.example.colorswitch.utils.MySharedPreference
import kotlinx.android.synthetic.main.activity_color.*

class ColorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color)

        MySharedPreference.init(this)
    }

    override fun onStart() {
        super.onStart()

        if (MySharedPreference.animation == 1) {
            switchalpha.isChecked = true
        } else if (MySharedPreference.animation == 2) {
            switchscale.isChecked = true
        } else if (MySharedPreference.animation == 3) {
            switchtranslate.isChecked = true
        } else if (MySharedPreference.animation == 4) {
            switchrotate.isChecked = true
        } else if (MySharedPreference.animation == 5) {
            switchcombination.isChecked = true
        }

        switchalpha.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                MySharedPreference.animation = 1
                Toast.makeText(this, "You start anim", Toast.LENGTH_SHORT).show()

            } else {
                MySharedPreference.animation = 0
            }
            finish()
        }
        switchscale.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                MySharedPreference.animation = 2
                Toast.makeText(this, "You start anim", Toast.LENGTH_SHORT).show()

            } else {
                MySharedPreference.animation = 0
            }
            finish()
        }

        switchtranslate.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                MySharedPreference.animation = 3
                Toast.makeText(this, "You start anim", Toast.LENGTH_SHORT).show()

            } else {
                MySharedPreference.animation = 0
            }
            finish()
        }
        switchrotate.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                MySharedPreference.animation = 4
                Toast.makeText(this, "You start anim", Toast.LENGTH_SHORT).show()

            } else {
                MySharedPreference.animation = 0
            }
            finish()
        }

        switchcombination.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                MySharedPreference.animation = 5
                Toast.makeText(this, "You start anim", Toast.LENGTH_SHORT).show()

            } else {
                MySharedPreference.animation = 0
            }
            finish()
        }
    }
}
