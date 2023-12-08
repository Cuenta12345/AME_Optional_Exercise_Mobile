package com.example.ame_optional_exercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

lateinit var button: Button
lateinit var textPrice:EditText
lateinit var textIVA:EditText
lateinit var textTotal:TextView


var totalCalculated:Float = 0F;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.calculate)
        textPrice = findViewById(R.id.editTextNumberDecimal)
        textIVA = findViewById(R.id.editTextIVA)
        textTotal = findViewById(R.id.editTextTotal)

        button.setOnClickListener {
            if (!textPrice.text.isEmpty() && !textIVA.text.isEmpty()){
                totalCalculated = textPrice.text.toString().toFloat() + ((textPrice.text.toString().toFloat() * textIVA.text.toString().toFloat()) / 100)
                textTotal.text = totalCalculated.toString()
            }



        }
    }

}