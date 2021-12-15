package com.example.jetpackcompose.uitraning1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
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
    Column {
        SectionContent()
        LazyColumn(
            modifier = Modifier
                .weight(1f)
        ) {
            item {
                CellContent("こんにちは", 10)
                CellContent("こんばんは", 30)
                CellContent("おはようございます", 100)
                CellContent("こんにちは", 10)
                CellContent("こんばんは", 30)
                CellContent("おはようございます", 100)
                CellContent("こんにちは", 10)
                CellContent("こんばんは", 30)
                CellContent("おはようございます", 100)
                CellContent("こんにちは", 10)
                CellContent("こんばんは", 30)
                CellContent("おはようございます", 100)
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        ) {

        }
    }
}

@Composable
fun SectionContent() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 40.dp, end = 40.dp, top = 8.dp, bottom = 8.dp)
    ) {
        Text(
            text = "あなた",
            fontSize = 20.sp,
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .weight(1f)
                .background(
                    color = Color(0xffffa500),
                    shape = RoundedCornerShape(topStart = 10.dp, bottomStart = 10.dp)
                )
                .padding(top = 8.dp, bottom = 8.dp)
        )
        Text(
            text = "運営から",
            fontSize = 20.sp,
            color = Color(0xffffa500),
            textAlign = TextAlign.Center,
            modifier = Modifier
                .weight(1f)
                .background(Color.White)
                .border(
                    width = 1.dp,
                    color = Color(0xffffa500),
                    shape = RoundedCornerShape(topEnd = 10.dp, bottomEnd = 10.dp)
                )
                .padding(top = 8.dp, bottom = 8.dp)
        )
    }
}

@Composable
fun CellContent(title: String, time: Int) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xffF9F1F0))
    ) {
        Text(
            text = title,
            fontSize = 20.sp,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 8.dp)
        )
        Text(
            text = "...",
            fontSize = 20.sp,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 8.dp, top = 16.dp)
        )
        Text(
            text = "${time}分前",
            fontSize = 20.sp,
            color = Color.Black,
            textAlign = TextAlign.End,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, end = 16.dp, bottom = 16.dp)
        )
        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp),
            color = Color.Gray
        )
    }
}