package com.example.education


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.education.myDraw
import android.support.constraint.ConstraintLayout
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.*


class Drawing : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drawing)
        //Setting up myDraw to insert the drawing canvas
        val myDraw = myDraw(this);
        val homeLayout = findViewById<View>(R.id.root) as ConstraintLayout
        homeLayout.addView(myDraw)

        //Setting up the button that clears the drawing and the object to draw
        val clear = findViewById<View>(R.id.clear) as Button
        clear.setOnClickListener {
            myDraw.reset()
            val toDraw = findViewById<View>(R.id.draw2) as TextView
            toDraw.setText("")
        }

        //Setting up random values assigned to a random obnject for the user to draw
        val random = findViewById<View>(R.id.random) as Button
        random.setOnClickListener {
            val r = Random()
            val rand = r.nextInt(10 - 1) + 1
            val toDraw = findViewById<View>(R.id.draw2) as TextView
            when (rand){
                1 -> toDraw.setText("dog")
                2 -> toDraw.setText("cat")
                3 -> toDraw.setText("car")
                4 -> toDraw.setText("tree")
                5 -> toDraw.setText("baseball bat")
                6 -> toDraw.setText("football")
                7 -> toDraw.setText("egg")
                8 -> toDraw.setText("paintbrush")
                9 -> toDraw.setText("cow")
                10 -> toDraw.setText("phone")
            }
        }
    }
}

