package com.example.education

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class SpellingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spelling)

        //Finding the button and setting the click listener for the button
        val checkButton = findViewById<View>(R.id.submit) as Button
        checkButton.setOnClickListener {
            //These spell values take the word from each of the
            //specific spelling test entries
            val spell1 = findViewById<View>(R.id.spelling1) as EditText
            val spe1 = spell1.text.toString()
            val spell2 = findViewById<View>(R.id.spelling2) as EditText
            val spe2 = spell2.text.toString()
            val spell3 = findViewById<View>(R.id.spelling3) as EditText
            val spe3 = spell3.text.toString()
            val spell4 = findViewById<View>(R.id.spelling4) as EditText
            val spe4 = spell4.text.toString()
            val spell5 = findViewById<View>(R.id.spelling5) as EditText
            val spe5 = spell5.text.toString()
            val spell6 = findViewById<View>(R.id.spelling6) as EditText
            val spe6 = spell6.text.toString()
            val spell7 = findViewById<View>(R.id.spelling7) as EditText
            val spe7 = spell7.text.toString()
            val spell8 = findViewById<View>(R.id.spelling8) as EditText
            val spe8 = spell8.text.toString()
            val spell9 = findViewById<View>(R.id.spelling9) as EditText
            val spe9 = spell9.text.toString()
            val spell10 = findViewById<View>(R.id.spelling10) as EditText
            val spe10 = spell10.text.toString()

            //These if statements check to see if all of the answers are right for each set of spellings
            if((spe1.equals("like"))&& (spe2.equals("equal"))&& (spe3.equals("stopped"))
                && (spe4.equals("stop"))&& spe5.equals(("play"))&& spe6.equals(("night"))
                && (spe7.equals("happy"))&& spe8.equals(("plant")) && spe9.equals(("three"))
                && (spe10.equals("pick"))) {
                checkButton.setText("All right, well done!")
            }
            else if((spe1.equals("other"))&& (spe2.equals("have"))&& (spe3.equals("drive"))
                && (spe4.equals("yellow"))&& spe5.equals(("seat"))&& spe6.equals(("riding"))
                && (spe7.equals("keep"))&& spe8.equals(("green")) && spe9.equals(("nine"))
                && (spe10.equals("think"))) {
                checkButton.setText("All right, well done!")
            }
            else if((spe1.equals("park"))&& (spe2.equals("hit"))&& (spe3.equals("drop"))
                && (spe4.equals("eating"))&& spe5.equals(("egg"))&& spe6.equals(("zoo"))
                && (spe7.equals("light"))&& spe8.equals(("seem")) && spe9.equals(("each"))
                && (spe10.equals("ice"))) {
                checkButton.setText("All right, well done!")
            }
            else if((spe1.equals("above"))&& (spe2.equals("face"))&& (spe3.equals("forgot"))
                && (spe4.equals("hate"))&& spe5.equals(("point"))&& spe6.equals(("high"))
                && (spe7.equals("twelve"))&& spe8.equals(("pocket")) && spe9.equals(("heat"))
                && (spe10.equals("broke"))) {
                checkButton.setText("All right, well done!")
            }
            //Else if any spellings are wrong it will encourage for a re-try
            else{
                checkButton.setText("One or more wrong, try again!")
            }
        }
    }
}
