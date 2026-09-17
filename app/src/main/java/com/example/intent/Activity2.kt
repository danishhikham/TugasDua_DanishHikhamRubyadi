package com.example.intent

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.intent.screen.ActivityScreen


class Activity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val bundle = intent.extras
        val data = bundle?.getString("data1") ?: ""

        setContent {
            ActivityScreen(data)
        }

    }
}




