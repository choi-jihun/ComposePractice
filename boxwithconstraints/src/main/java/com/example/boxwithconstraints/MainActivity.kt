package com.example.boxwithconstraints

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.boxwithconstraints.ui.theme.ComposePraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePraTheme {
                // A surface container using the 'background' color from the theme
                Outer()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposePraTheme {
        Outer()
    }
}

@Composable
fun Outer() {
    Column(modifier = Modifier.width(150.dp)) {//max값이 150으로 조정됨
        Inner(
            modifier = Modifier.width(200.dp).height(160.dp)
                //.widthIn(min = 100.dp, max = 350.dp)
                //.heightIn(max = 130.dp)
        )
    }
}

@Composable
private fun Inner(modifier: Modifier = Modifier) {
    BoxWithConstraints {
        if (maxHeight > 150.dp)
            Text(
                text = "너무 길어요!",
                modifier = Modifier.align(Alignment.BottomCenter)
            )
        Text(text = "maxW : $maxWidth maxH : $maxHeight minW : $minWidth minH : $minHeight")
    }
}
