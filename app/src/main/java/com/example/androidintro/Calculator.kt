package com.example.androidintro



import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_calculator)

        val res = findViewById<TextView>(R.id.textView3)

        val etNum1 = findViewById<EditText>(R.id.editTextNumber)

        val etNum2 = findViewById<EditText>(R.id.editTextNumber2)

        val btAd = findViewById<Button>(R.id.button5)
        btAd.setOnClickListener {

            val num1 = etNum1.text.toString().toInt()
            val num2 = etNum2.text.toString().toInt()

            res.text = ""+ (num1 + num2)
        }

        val btSub = findViewById<Button>(R.id.button6)
        btSub.setOnClickListener {
            val num1 = etNum1.text.toString().toInt()
            val num2 = etNum2.text.toString().toInt()

            res.text = ""+ (num1 - num2)
        }

        val btMul = findViewById<Button>(R.id.button7)
        btMul.setOnClickListener {
            val num1 = etNum1.text.toString().toInt()
            val num2 = etNum2.text.toString().toInt()

            res.text = ""+ (num1 * num2)
        }

        val btDv = findViewById<Button>(R.id.button8)
        btDv.setOnClickListener {
            val num1 = etNum1.text.toString().toInt()
            val num2 = etNum2.text.toString().toInt()

            res.text = ""+ (num1 / num2)
        }
    }
}