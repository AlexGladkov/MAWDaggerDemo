package tech.mobiledeveloper.daggercoursedemoproject.manual

// Базовый интерфейс для сервисов
interface Service {
    fun performAction()
}

// Реализация сервиса, зависящего от Repository
class MyService(private val repository: MyRepository) : Service {
    override fun performAction() {
        println("Service is performing an action using ${repository.getData()}")
    }
}