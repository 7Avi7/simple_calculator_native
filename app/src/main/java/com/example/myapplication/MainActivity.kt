package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addingtwonumbers()

    }


    fun addingtwonumbers() {

        var num1 = findViewById<EditText>(R.id.number1)
        var num2 = findViewById<EditText>(R.id.number2)

        var addbutton = findViewById<Button>(R.id.additbutton)
        var multibutton = findViewById<Button>(R.id.multiitbutton)
        var clearbutton = findViewById<Button>(R.id.clearitbutton)


        addbutton.setOnClickListener {

            var addnum1 = num1.text.toString().toInt()
            var addnum2 = num2.text.toString().toInt()

            var result = addnum1 + addnum2

            Toast.makeText(this, "$result", Toast.LENGTH_SHORT).show()

        }

        multibutton.setOnClickListener {

            var multinum1 = num1.text.toString().toInt()
            var multinum2 = num2.text.toString().toInt()

            var result = multinum1 * multinum2

            Toast.makeText(this, "$result", Toast.LENGTH_SHORT).show()

        }



        clearbutton.setOnClickListener {
            num1.setText("")
            num2.setText("")

            Toast.makeText(this, "Cleared", Toast.LENGTH_SHORT).show()

        }


    }

}