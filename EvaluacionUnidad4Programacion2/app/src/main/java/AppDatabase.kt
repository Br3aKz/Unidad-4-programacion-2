import android.content.Context
import androidx.room.Database
import androidx.room.Room

class AppDatabase {
    @Database(entities = [medidor::class], version = 1)
    abstract class AppDatabase : RoomDatabase() {
        abstract fun MedidorDao(): MedidorDao

        companion object {
            @Volatile
            private var INSTANCE: AppDatabase? = null

            fun getDatabase(context: Context): AppDatabase {
                return INSTANCE ?: synchronized(this) {
                    val instance = Room.databaseBuilder(
                        context.applicationContext,
                        AppDatabase::class.java,
                        "app_database"
                    ).build()
                    INSTANCE = instance
                    instance
                }
            }
        }
    }
}

private fun Room.databaseBuilder(
    context: Context?,
    klass: Class<RoomDatabase.AppDatabase>,
    name: String
): androidx.room.RoomDatabase.Builder<RoomDatabase.AppDatabase> {
    TODO("Not yet implemented")
}
