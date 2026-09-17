package com.example.intent.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.intent.Activity2

@Composable
fun ActivityScreen(data: String){
    Column(
        modifier = Modifier.padding(48.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Text(text =  "Danish Hikham Rubyadi")
        Text(text = "245150400111054")

        Text(text = data)
    }
}