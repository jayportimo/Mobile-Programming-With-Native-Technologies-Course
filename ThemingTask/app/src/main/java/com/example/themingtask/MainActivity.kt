package com.example.themingtask

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.themingtask.ui.theme.ThemingTaskTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThemingTaskTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ThemingApp()
                }
            }
        }
    }
}

@Composable
fun ThemingApp() {
    val appModifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Theming App",
            style = MaterialTheme.typography.headlineMedium,
            modifier = appModifier
        )
        OutlinedTextField(
            value = "",
            onValueChange = {/*TODO*/},
            modifier = appModifier
        )
        Button(onClick = { /*TODO*/ },
            modifier = appModifier,
            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary)
        ) {
            Text(text = "Submit")
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ThemingTaskTheme {
        ThemingApp()
    }
}