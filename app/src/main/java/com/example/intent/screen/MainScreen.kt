package com.example.intent.screen

import android.content.Intent
import android.os.Bundle
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.intent.Activity2

@Composable
fun TugasDua() {
    val context = LocalContext.current
    var inputText by remember {
        mutableStateOf("")
    }
    Column ( modifier = Modifier
        .padding(48.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)) {
        Text(text = "Danish Hikham Rubyadi")
        Text(text = "245150400111054")

        OutlinedTextField(
            value = inputText,
            onValueChange = {
                inputText = it
            },
            label = {
                Text("Input Text")
            },
            modifier = Modifier.fillMaxWidth()
        )
        Button(onClick = {
            val intent = Intent(
                context,
                Activity2::class.java
            )

            val bundle = Bundle()

            bundle.putString(
                "data1",
                inputText
            )
            intent.putExtras(bundle)
            context.startActivity(intent)
        }) {
            Text("Send")
        }
    }
}

@Preview
@Composable
fun tugasDuaPrev()
{
    TugasDua()
}