package com.example.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birth_day_greeting_card.*

class BirthDayGreetingCard : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birth_day_greeting_card)

        val name = intent.getStringExtra(NAME_EXTRA)
        birthdaygreeting.text = "Happy BirthDay\n$name"
    }
}