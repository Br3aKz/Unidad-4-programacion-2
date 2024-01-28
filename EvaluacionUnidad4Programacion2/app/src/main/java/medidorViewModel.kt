import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MedidorViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: medidorRepository
    private val allReadings: LiveData<List<medidor.Medidor>>

    init {
        val meterReadingDao = AppDatabase.getDatabase(application).meterReadingDao()
        repository = medidorRepository(meterReadingDao)
        allReadings = repository.allReadings
    }

    private fun medidorRepository(meterReadingDao: Any): Any {

    }

    fun insert(reading: medidor) = viewModelScope.launch {
        repository.insert(reading)
    }
}