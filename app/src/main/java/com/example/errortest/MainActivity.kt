package com.example.errortest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }


    override fun onStart() {
        super.onStart()

        val redBtn = findViewById<Button>(R.id.redbtn)
        redBtn.setOnClickListener{
            Log.d("MainActivity", "빨간색 버튼이 눌렸습니다.")
        }



        val blueBtn = findViewById<Button>(R.id.bluebtn)
        val greenBtn = findViewById<Button>(R.id.greenbtn)

        //빨간 버튼이 눌린 경우

        redBtn.setOnClickListener {

            Log.d("MainActivity", "빨간색 버튼이 눌렸습니다.")






            val fragmentManager = supportFragmentManager.beginTransaction()
            fragmentManager.replace(R.id.fragment,Red()).commit()

        }

        blueBtn.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.fragment,Blue()).commit()
        }

        greenBtn.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.fragment,Green()).commit()

        }

    }
}