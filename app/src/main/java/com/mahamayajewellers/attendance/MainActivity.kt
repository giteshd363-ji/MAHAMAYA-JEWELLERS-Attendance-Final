package com.mahamayajewellers.attendance

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView = TextView(this)
        textView.text = "MAHAMAYA JEWELLERS\nAttendance Sheet"
        textView.textSize = 24f
        textView.setPadding(32, 80, 32, 32)

        setContentView(textView)
    }
}
