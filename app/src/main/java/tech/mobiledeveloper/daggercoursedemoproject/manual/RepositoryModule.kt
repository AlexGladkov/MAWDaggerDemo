package tech.mobiledeveloper.daggercoursedemoproject.manual

// Интерфейс для репозитория
interface SomeRepository {
    fun getData(): String
}

// Реализация репозитория, зависящего от DatabaseHelper
class MyRepository(private val databaseHelper: DatabaseHelper) : SomeRepository {
    override fun getData(): String = "Data from ${databaseHelper.getDbName()}"
}

class SecondRepository(private val httpHelper: HttpHelper) : SomeRepository {
    override fun getData(): String {
        return httpHelper.makeRequest()
    }
}

class ThirdRepository(
    private val httpHelper: HttpHelper,
    private val databaseHelper: DatabaseHelper
) : SomeRepository {

    override fun getData(): String {
        val response = httpHelper.makeRequest()
        databaseHelper.saveData(response)
        return response
    }

}