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

        if (MySharedPreference.color != 1) {
            switchred.isChecked = false
        } else if (MySharedPreference.color != 2) {
            switchorange.isChecked = false
        } else if (MySharedPreference.color != 3) {
            switchyellow.isChecked = false
        } else if (MySharedPreference.color != 4) {
            switchgreen.isChecked = false
        } else if (MySharedPreference.color != 5) {
            switchblue.isChecked = false
        } else if (MySharedPreference.color != 6) {
            switchindigo.isChecked = false
        } else if (MySharedPreference.color != 7) {
            switchviolet.isChecked = false
        }
    }

    override fun onStart() {
        super.onStart()

        if (MySharedPreference.color == 1) {
            switchred.isChecked = true
        } else if (MySharedPreference.color == 2) {
            switchorange.isChecked = true
        } else if (MySharedPreference.color == 3) {
            switchyellow.isChecked = true
        } else if (MySharedPreference.color == 4) {
            switchgreen.isChecked = true
        } else if (MySharedPreference.color == 5) {
            switchblue.isChecked = true
        } else if (MySharedPreference.color == 6) {
            switchindigo.isChecked = true
        } else if (MySharedPreference.color == 7) {
            switchviolet.isChecked = true
        } else if (MySharedPreference.color != 1) {
            switchred.isChecked = false
        }

        switchred.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                MySharedPreference.color = 1
            } else {
                MySharedPreference.color = 0
            }
            MyData.color = R.color.red
            Toast.makeText(this, "You change color", Toast.LENGTH_SHORT).show()
            finish()
        }
        switchorange.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                MySharedPreference.color = 2
            } else {
                MySharedPreference.color = 0
            }
            MyData.color = R.color.orange
            Toast.makeText(this, "You change color", Toast.LENGTH_SHORT).show()
            finish()
        }
        switchyellow.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                MySharedPreference.color = 3
            } else {
                MySharedPreference.color = 0
            }
            MyData.color = R.color.yellow
            Toast.makeText(this, "You change color", Toast.LENGTH_SHORT).show()
            finish()
        }
        switchgreen.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                MySharedPreference.color = 4
            } else {
                MySharedPreference.color = 0
            }
            MyData.color = R.color.green
            Toast.makeText(this, "You change color", Toast.LENGTH_SHORT).show()
            finish()
        }
        switchblue.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                MySharedPreference.color = 5
            } else {
                MySharedPreference.color = 0
            }
            MyData.color = R.color.blue
            Toast.makeText(this, "You change color", Toast.LENGTH_SHORT).show()
            finish()
        }
        switchindigo.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                MySharedPreference.color = 6
            } else {
                MySharedPreference.color = 0
            }
            MyData.color = R.color.indigo
            Toast.makeText(this, "You change color", Toast.LENGTH_SHORT).show()
            finish()
        }
        switchviolet.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                MySharedPreference.color = 7
            } else {
                MySharedPreference.color = 0
            }
            MyData.color = R.color.violet
            Toast.makeText(this, "You change color", Toast.LENGTH_SHORT).show()
            finish()
        }

    }
}
