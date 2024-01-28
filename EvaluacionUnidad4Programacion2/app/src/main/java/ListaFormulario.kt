import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.input.TextFieldValue

class ListaFormulario {
}
@Composable
fun ListaFormulario(
    onAñadirLectura: (medidor.Medidor) -> Unit
) {
    var type by remember { mutableStateOf(TextFieldValue()) }
    var value by remember { mutableStateOf(TextFieldValue()) }
    var date by remember { mutableStateOf(TextFieldValue()) }


    Button(onClick = {
        val newLectura = medidor.Medidor(
            type = type.text,
            value = value.text.toDoubleOrNull() ?: 0.0,
            date = date.text.toLongOrNull() ?: 0L
        )
        onAñadirLectura(newLectura)
    }) {
        Text("Agregar Lectura")
    }
}