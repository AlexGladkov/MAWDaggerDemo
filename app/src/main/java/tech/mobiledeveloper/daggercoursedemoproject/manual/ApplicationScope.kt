package tech.mobiledeveloper.daggercoursedemoproject.manual

// Класс для скоупинга и создания зависимостей
class ApplicationScope {
    val databaseHelper = DatabaseHelper("MyDatabase")
    val httpHelper = HttpHelper()

    val repository = MyRepository(databaseHelper)
    val secondRepository = SecondRepository(httpHelper)
    val thirdRepository = ThirdRepository(httpHelper, databaseHelper)

    val service = MyService(repository)
    val secondService = SecondService(secondRepository, myRepository = repository)
}