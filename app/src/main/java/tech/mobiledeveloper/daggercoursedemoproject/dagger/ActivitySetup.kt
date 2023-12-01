package tech.mobiledeveloper.daggercoursedemoproject.dagger

import dagger.Component
import dagger.Module
import dagger.Provides
import tech.mobiledeveloper.daggercoursedemoproject.MainActivity
import javax.inject.Singleton


@Module
class AppModule {

    @Provides
    @Singleton
    fun provideNetworkClient(): NetworkClient = NetworkClient()
}

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)
}