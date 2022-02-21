package com.example.practical

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val no1 = findViewById<EditText>(R.id.edittext1);
        val no2 = findViewById<EditText>(R.id.edittext2);
        val addBtn = findViewById<Button>(R.id.addBtn)
        val subBtn = findViewById<Button>(R.id.subBtn)
        val mulBtn = findViewById<Button>(R.id.mulBtn)
        val divBtn = findViewById<Button>(R.id.divBtn)
        val tableBtn = findViewById<Button>(R.id.tableBtn)
        val result =findViewById<TextView>(R.id.result)

       addBtn.setOnClickListener {
           result.setText((no1.text.toString().toInt()+no2.text.toString().toInt()).toString())
       }

        subBtn.setOnClickListener {
            result.setText((no1.text.toString().toInt()-no2.text.toString().toInt()).toString())
        }
        mulBtn.setOnClickListener {
            result.setText((no1.text.toString().toInt()*no2.text.toString().toInt()).toString())
        }
        divBtn.setOnClickListener {
            result.setText((no1.text.toString().toInt()/no2.text.toString().toInt()).toString())
        }
        tableBtn.setOnClickListener {
            val num = no1.text.toString().toInt();
            var table = ""
            for (i in 1..10) {
                table = table + "\n" + num + " x " + i + " = " + (num*i)
            }
            result.setText(table)

        }

    }
}