package tech.mobiledeveloper.daggercoursedemoproject.manual

// Интерфейс для репозитория
interface SomeRepository {
    fun getData(): String
}

// Реализация репозитория, зависящего от DatabaseHelper
class MyRepository(private val databaseHelper: DatabaseHelper) : SomeRepository {
    override fun getData(): String = "Data from ${databaseHelper.getDbName()}"
}