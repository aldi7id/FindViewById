package com.ajgroup.findviewbyid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    lateinit var btnClickMe: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnClickMe = findViewById(R.id.btn_click_me)
        btnClickMe.text = "Klik saya"

        btnClickMe.setOnClickListener {

            Snackbar.make(btnClickMe, "Tombol Ditekan", Snackbar.LENGTH_LONG).setAction("OK BosQ", View.OnClickListener {

            }).show() }
        }

    }