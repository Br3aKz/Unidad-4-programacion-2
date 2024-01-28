import androidx.room.Entity
import androidx.room.PrimaryKey

class medidor {
    @Entity
    data class Medidor(
        @PrimaryKey(autoGenerate = true)
        val id: Long = 0,
        val type: String,
        val value: Double,
        val date: Long
    )
}