package com.example.slotapi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Checkbox
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.slotapi.ui.theme.ComposePraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePraTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    SlotEx()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposePraTheme {
        SlotEx()
    }
}

//@Composable
//fun CheckBoxWithText(checked : MutableState<Boolean>, text : String, content: @Composable () -> Unit){
//    Row(verticalAlignment = Alignment.CenterVertically) {
//        Checkbox(
//            checked = checked.value,
//            onCheckedChange = { checked.value = it }
//        )
//        Text(
//            text = text,
//            modifier = Modifier.clickable { checked.value = !checked.value }
//        )
//    }
//}

@Composable
fun CheckBoxWithText(checked: Boolean,onCheckedChange: () -> Unit, content: @Composable RowScope.() -> Unit) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.clickable {
            onCheckedChange()
        }
    ) {
        Checkbox(
            checked = checked,
            onCheckedChange = { onCheckedChange() }
        )
        content()
    }
}

@Composable
fun SlotEx() {
    var checked1 by remember {
        mutableStateOf(false)
    }
    var checked2 by remember {
        mutableStateOf(false)
    }
    Column {
//        Row(verticalAlignment = Alignment.CenterVertically) {
//            Checkbox(
//                checked = checked1.value,
//                onCheckedChange = { checked1.value = it }
//            )
//            Text(
//                text = "텍스트1",
//                modifier = Modifier.clickable { checked1.value = !checked1.value }
//            )
//        }
//        Row(verticalAlignment = Alignment.CenterVertically) {
//            Checkbox(
//                checked = checked2.value,
//                onCheckedChange = { checked2.value = it }
//            )
//            Text(
//                text = "텍스트2",
//                modifier = Modifier.clickable { checked2.value = !checked2.value }
//            )
//        }
        CheckBoxWithText(checked = checked1, onCheckedChange = {checked1 = !checked1}) {
            Text(text = "텍스트1")
        }
        CheckBoxWithText(checked = checked2, onCheckedChange = {checked2 = !checked2}) {
            Text(text = "텍스트2")
        }
    }
}
