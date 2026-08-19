package com.mahamayajewellers.attendance

import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val mainLayout = LinearLayout(this)
        mainLayout.orientation = LinearLayout.VERTICAL
        mainLayout.setPadding(30, 50, 30, 30)

        val title = TextView(this)
        title.text = "MAHAMAYA JEWELLERS\nAttendance Sheet"
        title.textSize = 26f
        title.gravity = Gravity.CENTER
        title.setTextColor(Color.BLACK)

        mainLayout.addView(title)

        val employeeTitle = TextView(this)
        employeeTitle.text = "Employee Attendance"
        employeeTitle.textSize = 22f
        employeeTitle.setPadding(0, 50, 0, 30)

        mainLayout.addView(employeeTitle)

        val employees = arrayOf(
            "Employee 1",
            "Employee 2",
            "Employee 3",
            "Employee 4",
            "Employee 5"
        )

        for (employee in employees) {

            val name = TextView(this)
            name.text = employee
            name.textSize = 18f
            name.setPadding(0, 15, 0, 10)

            mainLayout.addView(name)

            val buttonLayout = LinearLayout(this)
            buttonLayout.orientation = LinearLayout.HORIZONTAL

            val present = Button(this)
            present.text = "Present"

            val absent = Button(this)
            absent.text = "Absent"

            val halfDay = Button(this)
            halfDay.text = "Half Day"

            buttonLayout.addView(present)
            buttonLayout.addView(absent)
            buttonLayout.addView(halfDay)

            mainLayout.addView(buttonLayout)
        }

        setContentView(mainLayout)
    }
}
