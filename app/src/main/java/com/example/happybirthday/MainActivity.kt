package com.example.happybirthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AbsListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.view.View as View1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun Click_Here(view: View1){

        val name = nameInput.editableText.toString()
        val intent = Intent(this, BirthDayGreetingCard::class.java)
        intent.putExtra(BirthDayGreetingCard.NAME_EXTRA, name)

        startActivity(intent)
    }
}