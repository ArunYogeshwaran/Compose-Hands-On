package com.aruny.composetrials

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aruny.composetrials.ui.theme.ComposeHandsOnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeHandsOnTheme {
                MyApp(modifier = Modifier.fillMaxWidth())
            }
        }
    }
}

@Composable
private fun MyApp(
    modifier: Modifier = Modifier,
    names: List<String> = listOf("Android", "Compose")
) {
    // A surface container using the 'background' color from the theme
    Surface(
        modifier = modifier,
        color = MaterialTheme.colorScheme.surface
    ) {
        Column(modifier) {
            for (name in names) {
                Greeting(name)
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Surface(
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp)
        ) {
            Text(text = "Hello")
            Text(text = "$name!")
        }
    }
}

@Preview(
    name = "My Preview",
    showBackground = true,
    widthDp = 320,
    group = "Default",
    showSystemUi = true,
    device = Devices.PIXEL_C,
    backgroundColor = 0x989a82,
)
@Composable
fun DefaultPreview() {
    ComposeHandsOnTheme {
        MyApp()
    }
}