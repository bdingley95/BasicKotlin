package com.example.education

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button;
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_quiz.*
import java.util.*


class Quiz : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        //Creating the button value and deciding what happens when it is pressed
        val button = findViewById<View>(R.id.quizzing)
        button.setOnClickListener {
            //Setting up a value for the quizquestion text
            val question = findViewById<View>(R.id.quizquestion) as TextView
            //Creating a random value between 1-10 to select from 10 quiz questions
            val r = Random()
            val i1 = r.nextInt(10 - 1) + 1

            if (i1.equals(1)){
                question.setText("What is 12 x 10?");
            }
            if (i1.equals(2)){
                question.setText("What sweet food do bees make?");
            }
            if (i1.equals(3)){
                question.setText("What school did Harry Potter go to?");
            }
            if (i1.equals(4)){
                question.setText("Where are kangaroos from?");
            }
            if (i1.equals(5)){
                question.setText("Which river flows through London?");
            }
            if (i1.equals(6)){
                question.setText("How many years are in a century?");
            }
            if (i1.equals(7)){
                question.setText("What is the name of Batman's partner?");
            }
            if (i1.equals(8)){
                question.setText("How many days are in a normal year?");
            }
            if (i1.equals(9)){
                question.setText("How many sides does a pentagon have?");
            }
            if (i1.equals(10)){
                question.setText("What is the capital city of England?");
            }
        }
        //Setting up the button that checks the answer
        val button1 = findViewById<View>(R.id.check)
        button1.setOnClickListener {
            //Setting up the value for checking the answer against the question to
            //make sure the answer is correct
            val check = findViewById<View>(R.id.check) as TextView
            val question = findViewById<View>(R.id.quizquestion) as TextView
            val question2 = question.text.toString()
            val answer = findViewById<View>(R.id.answer) as EditText
            val answer2 = answer.text.toString()
            //Numerous if statements for testing the answer to the question
            if (question2.equals("What is 12 x 10?") &&  answer2.equals("120")){
                check.setText("correct, well done!");
            }
            else if (question2.equals("What sweet food do bees make?") &&  answer2.equals("honey")){
                check.setText("correct, well done!");
            }
            else if (question2.equals("What school did Harry Potter go to?") &&  answer2.equals("hogwarts")){
                check.setText("correct, well done!");
            }
            else if (question2.equals("Where are kangaroos from?") &&  answer2.equals("australia")){
                check.setText("correct, well done!");
            }
            else if (question2.equals("Which river flows through London?") &&  answer2.equals("thames")){
                check.setText("correct, well done!");
            }
            else if (question2.equals("How many years are in a century?") &&  answer2.equals("100")){
                check.setText("correct, well done!");
            }
            else if (question2.equals("What is the name of Batman's partner?") &&  answer2.equals("robin")){
                check.setText("correct, well done!");
            }
            else if (question2.equals("How many days are in a normal year?") &&  answer2.equals("365")){
                check.setText("correct, well done!");
            }
            else if (question2.equals("How many sides does a pentagon have?") &&  answer2.equals("5")){
                check.setText("correct, well done!");
            }
            else if (question2.equals("What is the capital city of England?") &&  answer2.equals("London")){
                check.setText("correct, well done!");
            }
            else{
                check.setText("incorrect, try again!");
            }

        }
    }
}