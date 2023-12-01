package tech.mobiledeveloper.daggercoursedemoproject

import android.app.Application
import tech.mobiledeveloper.daggercoursedemoproject.dagger.AppComponent
import tech.mobiledeveloper.daggercoursedemoproject.dagger.AppModule
import tech.mobiledeveloper.daggercoursedemoproject.dagger.DaggerAppComponent

class MainApplication: Application() {
    val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
            .appModule(AppModule())
            .build()
    }

}