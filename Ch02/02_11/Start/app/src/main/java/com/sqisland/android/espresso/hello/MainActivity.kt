package com.sqisland.android.espresso.hello

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

  // Declare the greet button

  private lateinit var greetButton: View
  private lateinit var greetingView: TextView

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    // Instantiate the greet button
    greetButton = findViewById(R.id.greet_button)

    greetingView = findViewById(R.id.greeting)
  }

  fun greet(v: View) {

    // Disable the greet button
    greetButton.isEnabled = false

    greetingView.setText(R.string.hello)
  }
}