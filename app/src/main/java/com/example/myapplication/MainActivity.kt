package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn:Button=findViewById(R.id.button)
        val txt:EditText=findViewById(R.id.name)
        val age:EditText=findViewById(R.id.age)
        btn.setOnClickListener(View.OnClickListener {
            if(!txt.getText().toString().isEmpty() && !age.getText().toString().isEmpty() )
            {
                Toast.makeText(this, "Hey! ${txt.text}\nGo Corona Go", Toast.LENGTH_SHORT).show()
            }
            else if(!txt.getText().toString().isEmpty() && age.getText().toString().isEmpty())
            {
                Toast.makeText(this, "Enter your age", Toast.LENGTH_SHORT).show()
            }
            else if(txt.getText().toString().isEmpty() && !age.getText().toString().isEmpty())
            {
                Toast.makeText(this, "Enter your name", Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(this, "Enter your name and age", Toast.LENGTH_SHORT).show()
            }
        })
    }}
