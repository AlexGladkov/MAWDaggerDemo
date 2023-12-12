package tech.mobiledeveloper.daggercoursedemoproject.dagger

import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.Subcomponent
import tech.mobiledeveloper.daggercoursedemoproject.MainActivity
import javax.inject.Singleton


@Module
class AppModule {

    @Provides
    @Singleton
    fun provideNetworkClient(): NetworkClient = NetworkClient()

    @Provides
    @Singleton
    fun provideDatabaseClient(): DatabaseClient = DatabaseClient()
}

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun activityComponent(): ActivityComponent.Factory
}

@Subcomponent(modules = [FeatureModule::class])
interface ActivityComponent {

    // Factory to create instances of ActivityComponent
    @Subcomponent.Factory
    interface Factory {
        fun create(): ActivityComponent
    }

    // Classes that can be injected by this Component
    fun inject(activity: MainActivity)
}

@Module
class FeatureModule {
    @Provides
    fun provideActivityDependency(networkClient: NetworkClient, databaseClient: DatabaseClient): FullRepository =
        FullRepository(networkClient = networkClient, databaseClient = databaseClient)
}