package tech.mobiledeveloper.daggercoursedemoproject.dagger

class FullRepository(val databaseClient: DatabaseClient, val networkClient: NetworkClient) {

    fun makeRequest() {
        networkClient.doSomething()
        databaseClient.doSomething()
    }
}