package com.example.dinnerdecider

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val foodList= arrayListOf("Chinese", "Indian", "KFC", "McDonalds")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val textView = findViewById<TextView>(R.id.selectedFoodText)
//        "Chinese".also { textView.text = it }
        val decideButton = findViewById<Button>(R.id.decideBtn)
        decideButton.setOnClickListener{
            val random= java.util.Random()
            val randomFood=random.nextInt(foodList.count())
            selectedFoodText.text=foodList[randomFood]

    }

        addfoodbtn.setOnClickListener {
            val newFood= addFoodTxt.text.toString()
            foodList.add(newFood)
            addFoodTxt.text.clear()
        }

    }
}