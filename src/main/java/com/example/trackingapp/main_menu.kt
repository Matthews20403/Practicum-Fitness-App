package com.example.trackingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class main_menu : AppCompatActivity() {
    companion object{
        val activityList = mutableListOf<Activity>()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_menu)

        // declaring edit texts
        val Day = findViewById<EditText>(R.id.txtDay)
        val Morning = findViewById<EditText>(R.id.txtMorning)
        val Afternoon = findViewById<EditText>(R.id.txtNoon)
        val Notes = findViewById<EditText>(R.id.txtRunning)

        //declaring buttons
        val btnsave = findViewById<Button>(R.id.savedataBTN)
        val btnclear = findViewById<Button>(R.id.cleardataBTN)
        val btndisplay =findViewById<Button>(R.id.showdetailsBTN)

        // when save button is clicked
        btnsave.setOnClickListener{

            val Date = Day.text.toString()
            val MorningRun = Morning.text.toString()
            val AfternoonRun = Afternoon.text.toString()
            val RunningNotes = Notes.text.toString()

            if (Date.isNotBlank() && MorningRun.isNotBlank() && AfternoonRun.isNotBlank() && RunningNotes.isNotBlank()){

                // lets insert the data into the list.
                activityList.add(Activity(Date, MorningRun, AfternoonRun, RunningNotes))
                Day.text.clear()
                Morning.text.clear()
                Afternoon.text.clear()
                Notes.text.clear()

            }
        }
        btndisplay.setOnClickListener {

            // calling the second screen to show data.
            startActivity(Intent(this,Display::class.java))
        }
        // clears everything when the button is clicked.
        btnclear.setOnClickListener {
            Day.text.clear()
            Morning.text.clear()
            Afternoon.text.clear()
            Notes.text.clear()
        }

    }
}