package com.example.coil

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage
import coil.compose.rememberImagePainter
import com.example.coil.ui.theme.ComposePraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePraTheme {
                CoilEx()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposePraTheme {
        CoilEx()
    }
}

@Composable
fun CoilEx() {
//    val painter = rememberImagePainter(data = "https://github.com/Fastcampus-Android-Lecture-Project-2023/part4-chapter3/blob/main/part4-chapter3-10/app/src/main/res/drawable-xhdpi/wall.jpg?raw=true")
//    Image(painter = painter, contentDescription = "캐년")
    Column {
        AsyncImage(model = "https://github.com/Fastcampus-Android-Lecture-Project-2023/part4-chapter3/blob/main/part4-chapter3-10/app/src/main/res/drawable-xhdpi/wall.jpg?raw=true", contentDescription = null)
        AsyncImage(model = "https://github.com/Fastcampus-Android-Lecture-Project-2023/part4-chapter3/blob/main/part4-chapter3-10/app/src/main/res/drawable-xhdpi/wall.jpg?raw=true", contentDescription = null)
    }

}
