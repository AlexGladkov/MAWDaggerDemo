package tech.mobiledeveloper.daggercoursedemoproject.manual

import tech.mobiledeveloper.daggercoursedemoproject.dagger.FullRepository

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

class SecondService(
    private val secondRepository: SecondRepository,
    private val myRepository: MyRepository
) : Service {

    override fun performAction() {
        val second = secondRepository.getData()
        val my = myRepository.getData()
        println("First $my + Second $second")
    }
}