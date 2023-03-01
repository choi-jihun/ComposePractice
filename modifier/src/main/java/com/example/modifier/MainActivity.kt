package com.example.modifier

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.modifier.ui.theme.ComposePraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePraTheme {
                ModifierEx()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposePraTheme {
        ModifierEx()
    }
}

@Composable
fun ModifierEx() {
    Button(
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Magenta,
            contentColor = Color.Cyan
        ), //컨텐트는 버튼내의 이미지나 텍스트같은 것의 색상
        onClick = {},
        //enabled = false,
        //modifier = Modifier.height(100.dp).width(200.dp) == Modifier.size(200.dp,100.dp)
        modifier = Modifier.padding(10.dp)//.background(Color.Red) 불가
    ) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = null,
            modifier = Modifier.background(Color.Blue)
        )
        Spacer(
            modifier = Modifier.size(ButtonDefaults.IconSpacing).background(Color.DarkGray)
        )
        Text("Search",
            modifier = Modifier
                .clickable {}
                .offset(x = 10.dp) //텍스트 위치 조정
        )
    }
}
