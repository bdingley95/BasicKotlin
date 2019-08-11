package com.example.education

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MathsTest : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maths_test)
        //Setting up a random value
        val r = Random()

        //Creating the addition values using the random value, setting the bounds as necessary
        val add1 = r.nextInt(100 - 1) + 1
        val add2 = r.nextInt(100 - 1) + 1
        val addition = " + "

        //Setting the text to the random addition question
        val additionQ = findViewById<View>(R.id.addition) as TextView
        additionQ.setText(add1.toString() + addition +  add2.toString());

        //Creating the subtraction values using the random value, setting the bounds as necessary
        val sub1 = r.nextInt(150 - 100) + 100
        val sub2 = r.nextInt(100 - 1) + 1
        val subtraction = " - "

        //Setting the text to the random subtraction question
        val subtractionQ = findViewById<View>(R.id.subtraction) as TextView
        subtractionQ.setText(sub1.toString() + subtraction +  sub2.toString());

        //Creating the multiplication values using the random value, setting the bounds as necessary
        val mul1 = r.nextInt(10 - 1) + 1
        val mul2 = r.nextInt(10 - 1) + 1
        val multiplication = " x "

        //Setting the text to the random multiplication question
        val multiplicationQ = findViewById<View>(R.id.multiplication) as TextView
        multiplicationQ.setText(mul1.toString() + multiplication +  mul2.toString());

        //Creating the division values using the random value, setting the bounds as necessary
        val div1 = r.nextInt(50 - 10)+10 * 2
        val div2 = r.nextInt(2 - 1)+1 * 2
        val division = " ÷ "

        //Setting the text to the random division question
        val divisionQ = findViewById<View>(R.id.division) as TextView
        divisionQ.setText(div1.toString() + division +  div2.toString());

        //Setting up the button for checking answers by comparing entered answer
        //to the mathematically calculated answer
        val checkButton = findViewById<View>(R.id.check)
        checkButton.setOnClickListener {
            val additionA = findViewById<View>(R.id.addition1) as EditText
            val addA = additionA.text.toString()
            val addB = Integer.parseInt(addA)

            val subtractionA = findViewById<View>(R.id.subtraction1) as EditText
            val subA = subtractionA.text.toString()
            val subB = Integer.parseInt(subA)

            val mutiplicationA = findViewById<View>(R.id.multiplication1) as EditText
            val mulA = mutiplicationA.text.toString()
            val mulB = Integer.parseInt(mulA)

            val divisionA = findViewById<View>(R.id.division1) as EditText
            val divA = divisionA.text.toString()
            val divB = Integer.parseInt(divA)


            if ((addB == add1 + add2) && (subB == sub1 - sub2) && (mulB == mul1 * mul2) && (divB == div1 / div2) ) {
                val check = findViewById<View>(R.id.check) as Button
                check.setText("All correct, well done!")
            } else {
                val check = findViewById<View>(R.id.check) as Button
                check.setText("One or more wrong, try again!")
            }
        }
    }
}
