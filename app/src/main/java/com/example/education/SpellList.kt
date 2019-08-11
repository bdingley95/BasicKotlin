package com.example.education

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import android.widget.AdapterView.OnItemSelectedListener
import kotlinx.android.synthetic.main.activity_spell_list.*


class SpellList : AppCompatActivity(), AdapterView.OnItemSelectedListener   {



    override fun onCreate(savedInstanceState: Bundle?)  {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spell_list)

        //Creating the spinner for the dropdown menu
        val dropdown: Spinner = findViewById<View>(R.id.lists) as Spinner
        dropdown.setOnItemSelectedListener(this)

        //Creating the array with values from the array created in the strings section
        ArrayAdapter.createFromResource(
            this,
            R.array.spelling_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            dropdown.adapter = adapter
        }
    }
    //Code specifying what to do when nothing is done
    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    //Code specifying what happens when a dropdown menu option is selected
    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

        val spell1 = findViewById<View>(R.id.spell1) as TextView
        val spell2 = findViewById<View>(R.id.spell2) as TextView
        val spell3 = findViewById<View>(R.id.spell3) as TextView
        val spell4 = findViewById<View>(R.id.spell4) as TextView
        val spell5 = findViewById<View>(R.id.spell5) as TextView
        val spell6 = findViewById<View>(R.id.spell6) as TextView
        val spell7 = findViewById<View>(R.id.spell7) as TextView
        val spell8 = findViewById<View>(R.id.spell8) as TextView
        val spell9 = findViewById<View>(R.id.spell9) as TextView
        val spell10 = findViewById<View>(R.id.spell10) as TextView

        //If list 1 is selected
        if(position == 0) {
            spell1.setText("like")
            spell2.setText("equal")
            spell3.setText("stopped")
            spell4.setText("stop")
            spell5.setText("play")
            spell6.setText("night")
            spell7.setText("happy")
            spell8.setText("plant")
            spell9.setText("three")
            spell10.setText("pick")
        }

        //If list 2 is selected
        if(position == 1) {
            spell1.setText("other")
            spell2.setText("have")
            spell3.setText("drive")
            spell4.setText("yellow")
            spell5.setText("seat")
            spell6.setText("riding")
            spell7.setText("keep")
            spell8.setText("green")
            spell9.setText("nine")
            spell10.setText("think")
        }

        //If list 3 is selected
        if(position == 2) {
            spell1.setText("park")
            spell2.setText("hit")
            spell3.setText("drop")
            spell4.setText("eating")
            spell5.setText("egg")
            spell6.setText("zoo")
            spell7.setText("light")
            spell8.setText("seem")
            spell9.setText("each")
            spell10.setText("ice")
        }

        //If list 4 is selected
        if(position == 3) {
            spell1.setText("above")
            spell2.setText("face")
            spell3.setText("forgot")
            spell4.setText("hate")
            spell5.setText("point")
            spell6.setText("high")
            spell7.setText("twelve")
            spell8.setText("pocket")
            spell9.setText("heat")
            spell10.setText("broke")
        }
    }
}
