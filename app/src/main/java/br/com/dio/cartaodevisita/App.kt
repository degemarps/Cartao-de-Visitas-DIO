package br.com.dio.cartaodevisita

import android.app.Application
import br.com.dio.cartaodevisita.data.AppDatabase
import br.com.dio.cartaodevisita.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}