import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable

class ListaLectura {
}
@Composable
fun ListaLectura(
    readings: List<medidor>,
    onItemClick: (medidor) -> Unit
) {
    LazyColumn {
        items(readings) { reading ->
            ReadingListItem(reading = reading, onItemClick = onItemClick)
        }
    }
}

@Composable
fun ReadingListItem(
    reading: medidor,
    onItemClick: (medidor) -> Unit
) {

}