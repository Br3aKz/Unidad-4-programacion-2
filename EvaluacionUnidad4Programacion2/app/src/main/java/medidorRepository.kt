import androidx.lifecycle.LiveData

class MedidorRepository(private val MedidorDao: MedidorDao) {
    val allReadings: Unit = MedidorDao.getAllReadings().asLiveData()

    suspend fun insert(reading: medidor) {
        MedidorDao.insertReading(reading)
    }
}

private fun Unit.asLiveData() {

}

private fun MedidorDao.getAllReadings() {
}
