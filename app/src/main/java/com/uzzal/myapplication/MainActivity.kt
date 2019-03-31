package com.uzzal.myapplication

import android.app.ActionBar
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        // toi change title of a activity
        val actionBar = supportActionBar
        actionBar!!.title = "Sign Up"

        val logButton = findViewById<Button>(R.id.button);

        logButton.setOnClickListener {
            startActivity(Intent(this@MainActivity,LoginActivity::class.java))


        }
    }
}
