package com.hanrstudios.sethisbusyisnthe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val isSethBusy: TextView = findViewById(R.id.Seth_is_busy_text)
        val hangoutButton: Switch = findViewById(R.id.hangout_switch)

        hangoutButton.setOnCheckedChangeListener { buttonView, isChecked ->
            if (hangoutButton.isChecked) {
                isSethBusy.text = "Seth is busy"
            } else {
                isSethBusy.text = "Seth isn't busy"
            }
        }

//        toDoActivity_hoursMinutes.setOnCheckedChangeListener { buttonView, isChecked ->
//            if (toDoActivity_hoursMinutes.isChecked){
//                toDoActivity_hoursMinutes.text = "HOURS"
//            } else {
//                toDoActivity_hoursMinutes.text = "MINUTES"
//            }
//        }
    }
}
