package tech.mobiledeveloper.daggercoursedemoproject.manual

// Класс помощника для работы с базой данных
class DatabaseHelper(private val dbName: String) {
    fun getDbName(): String = dbName
    fun saveData(data: String) = Unit
}