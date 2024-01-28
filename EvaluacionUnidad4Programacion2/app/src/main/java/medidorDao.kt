import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

class MedidorDao {
    fun insertReading(reading: medidor) {

    }

    @Dao
    interface MedidorDao {
        @Query("SELECT * FROM medidor")
        fun getAllReadings(): LiveData<List<medidor>>

        @Insert
        suspend fun insertReading(reading: medidor.Medidor)
    }
}