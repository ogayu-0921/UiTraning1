package com.example.jetpackcompose.uitraning1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstView()
        }
    }
}

@Composable
private fun FirstView() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 48.dp, end = 48.dp, top = 8.dp, bottom = 8.dp)
    ) {
        Text(
            text = "あなた",
            fontSize = 20.sp,
            color = Color.White,
            modifier = Modifier
                .padding(start = 40.dp, end = 40.dp, top = 8.dp, bottom = 8.dp)
                .background(Color(0xffa500))
                .padding(start = 96.dp, end = 96.dp, top = 16.dp, bottom = 16.dp)
        )
        Text(
            text = "運営から",
            fontSize = 20.sp,
            color = Color(0xffa500),
            modifier = Modifier
                .padding(start = 40.dp, end = 40.dp, top = 8.dp, bottom = 8.dp)
                .background(Color.White)
                .padding(start = 96.dp, end = 96.dp, top = 16.dp, bottom = 16.dp)
        )
    }
}