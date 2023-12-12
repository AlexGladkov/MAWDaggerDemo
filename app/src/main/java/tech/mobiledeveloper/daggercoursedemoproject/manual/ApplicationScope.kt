package tech.mobiledeveloper.daggercoursedemoproject.manual

// Класс для скоупинга и создания зависимостей
class ApplicationScope {
    val databaseHelper = DatabaseHelper("MyDatabase")
    val repository = MyRepository(databaseHelper)
    val service = MyService(repository)
}