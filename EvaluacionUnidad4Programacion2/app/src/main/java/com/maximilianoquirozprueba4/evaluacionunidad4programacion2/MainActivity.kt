package com.maximilianoquirozprueba4.evaluacionunidad4programacion2

import AppDatabase
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.maximilianoquirozprueba4.evaluacionunidad4programacion2.ui.theme.EvaluacionUnidad4Programacion2Theme

class MainActivity : ComponentActivity() {
    private lateinit var database: AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        database = AppDatabase.getDatabase(this)
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EvaluacionUnidad4Programacion2Theme {
        Greeting("Android")
    }
}
data class Measurement(val type: String, val value: Double, val date: String)
